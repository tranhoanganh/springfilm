package com.demo.film.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DirectorDto extends BaseDto {

    private String image;
    private String description;

//    @JsonIgnore
//    private List<FilmDto> films;

}
