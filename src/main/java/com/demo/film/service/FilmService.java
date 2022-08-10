package com.demo.film.service;

import com.demo.film.dto.CastDto;
import com.demo.film.dto.FilmDto;

import java.util.List;

public interface FilmService {
    List<FilmDto> findAllFilm();
    List<FilmDto> listTrending();
    List<FilmDto> listSuggest();
    List<FilmDto> listHot();
    List<FilmDto> listWatch();
    List<FilmDto> getFilmByCategory(int id);
    List<CastDto> getAllCastById(int id);

}
