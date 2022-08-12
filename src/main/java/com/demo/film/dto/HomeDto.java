package com.demo.film.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class HomeDto {

    private List<FilmDto> trending;
    private List<FilmDto> hot;
    private List<FilmDto> popular;
    private List<FilmDto> upcoming;

}
