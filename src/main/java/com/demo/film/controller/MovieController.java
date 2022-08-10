package com.demo.film.controller;

import com.demo.film.dto.BaseResponse;
import com.demo.film.dto.HomeDto;
import com.demo.film.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MovieController {

    @Autowired
    FilmService filmService;

    @GetMapping("/home")
    public ResponseEntity getHome() {
        BaseResponse res = new BaseResponse<>();
        HomeDto homeDto = new HomeDto();
        homeDto.setList_trending(filmService.listTrending());
        homeDto.setList_hot(filmService.listHot());
        homeDto.setList_suggest(filmService.listSuggest());
        homeDto.setList_watch(filmService.listWatch());
        res.data = homeDto;
        return ResponseEntity.ok(res);
    }

    @GetMapping("/category")
    public ResponseEntity getFilmByCategoryId(@Param("id") int id) {
        BaseResponse res = new BaseResponse<>();
        res.data = filmService.getFilmByCategory(id);
        return ResponseEntity.ok(res);
    }

    @GetMapping("/cast")
    public ResponseEntity getCastById(@Param("filmid") int filmid) {
        BaseResponse res = new BaseResponse();
        res.data = filmService.getAllCastById(filmid);
        return ResponseEntity.ok(res);
    }
}
