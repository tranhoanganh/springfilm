package com.demo.film.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentDto extends BaseDto {

    private Integer userId;
    private Integer filmId;
    private String content;
//    private FilmDto film;
    private UserDto user;

}
