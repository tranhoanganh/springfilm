package com.demo.film.controller;

import com.demo.film.dto.BaseResponse;
import com.demo.film.dto.HomeDto;
import com.demo.film.dto.UserDto;
import com.demo.film.dto.request.LoginRequest;
import com.demo.film.entity.UserEntity;
import com.demo.film.service.FilmService;
import com.demo.film.service.UserService;
import com.demo.film.utils.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ApiController {

    @Autowired
    AuthenticationManager authenticationManager;

    @Autowired
    FilmService filmService;

    @Autowired
    UserService userService;

    @Autowired
    JwtTokenUtil jwtTokenUtil;

    @PostMapping("/api/login")
    public ResponseEntity authenticateUser(@Valid @RequestBody LoginRequest loginRequest) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );
        // Nếu không xảy ra exception tức là thông tin hợp lệ
        // Set thông tin authentication vào Security Context
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtTokenUtil.generateToken((User) authentication.getPrincipal());
        UserDto userDto = userService.getUser(loginRequest.getUsername());
        BaseResponse res = new BaseResponse();
        Map data = new HashMap();
        data.put("access_token", token);
        data.put("user", userDto);
        res.data = data;
        return ResponseEntity.ok(res);
    }

    @PostMapping("/api/register")
    public ResponseEntity register(@Valid @RequestBody LoginRequest userRequest) {
        BaseResponse res = new BaseResponse();
        res.data = userService.createUser(userRequest);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/api/users")
    public ResponseEntity getAllUser() {
        List<UserEntity> users = userService.getAllUser();
        BaseResponse res = new BaseResponse(users);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/apifree/home")
    public ResponseEntity getHomeFree() {
        BaseResponse res = new BaseResponse<>();
        HomeDto homeDto = new HomeDto();
        homeDto.setList_trending(filmService.listTrending());
        homeDto.setList_hot(filmService.listHot());
        homeDto.setList_suggest(filmService.listSuggest());
        homeDto.setList_watch(filmService.listWatch());
        res.data = homeDto;
        return ResponseEntity.ok(res);
    }
}
