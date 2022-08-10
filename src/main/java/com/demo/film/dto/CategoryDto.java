package com.demo.film.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto extends BaseDto {

    private String image;

//    @JsonIgnore
    private List<FilmDto> movies;

}
