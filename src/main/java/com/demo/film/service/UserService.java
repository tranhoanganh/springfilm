package com.demo.film.service;

import com.demo.film.dto.UserDto;
import com.demo.film.dto.request.LoginRequest;
import com.demo.film.entity.UserEntity;
import com.demo.film.mapper.MapperDto;
import com.demo.film.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    @Lazy
    PasswordEncoder passwordEncoder;

    @Autowired
    MapperDto mapperDto;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserEntity userEntity = userRepo.findByUsername(username);
        if (userEntity == null) {
            throw new UsernameNotFoundException("username not found");
        }
        SimpleGrantedAuthority grand = new SimpleGrantedAuthority(userEntity.getRole().getName());
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        authorities.add(grand);
        User user = new User(userEntity.getUsername(), userEntity.getPassword(), authorities);
        return user;
    }

    public UserDto getUser(String username) {
        UserEntity userEntity = userRepo.findByUsername(username);
        UserDto userDto = mapperDto.convertToDto(userEntity);
        return userDto;
    }

    public List<UserEntity> getAllUser() {
        return userRepo.findAll();
    }

    public UserDto createUser(LoginRequest userRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setUsername(userRequest.getUsername());
        userEntity.setPassword(passwordEncoder.encode(userRequest.getPassword()));
        userEntity.setRoleId(2);
        userEntity = userRepo.save(userEntity);
        UserDto res = mapperDto.convertToDto(userEntity);
        return res;
    }

    @PreAuthorize("hasAuthority('admin')")
    public String deleteUser() {
        return "success";
    }
}
