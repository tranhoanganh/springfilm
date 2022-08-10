package com.demo.film.dto;

import com.demo.film.config.Constant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FilmDto extends BaseDto {
    private String thumbnail;
    private Integer categoryId;
    private Integer directorId;
    private String description;
    private Integer duration;
    private Integer view;
    private String url;
    private CategoryDto category;
    private DirectorDto director;
    private List<CastDto> casts;

//    @JsonIgnore
//    private List<CommentDto> comments;

    public String getThumbnail() {
        return Constant.LINK_MOVIES_IMAGE + thumbnail;
    }
}
