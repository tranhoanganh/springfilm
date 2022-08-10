package com.demo.film.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeDto {

    private List<FilmDto> list_trending;
    private List<FilmDto> list_hot;
    private List<FilmDto> list_suggest;
    private List<FilmDto> list_watch;

}
