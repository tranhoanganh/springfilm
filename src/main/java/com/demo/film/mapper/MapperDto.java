package com.demo.film.mapper;

import com.demo.film.dto.*;
import com.demo.film.entity.*;
import org.mapstruct.*;

@Mapper(componentModel="spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {
//    MapperUtil INSTANCE = Mappers.getMapper(MapperUtil.class);

    //        List<UserDto> listDto = list.stream()
//                .map(x -> mapperDto.convertToDto(x))
//                .collect(Collectors.toList());

    UserDto convertToDto(UserEntity entity);
    UserEntity convertToEntity(UserDto dto);
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    UserEntity updateWithNullAsNoChange(UserDto dto, @MappingTarget UserEntity entityInDB);

    RoleDto convertToDto(RoleEntity entity);
    RoleEntity convertToEntity(RoleDto dto);

    FilmDto convertToDto(FilmEntity entity);
    FilmEntity convertToEntity(FilmDto dto);

    CastDto convertToDto(CastEntity entity);
    CastEntity convertToEntity(CastDto dto);

    DirectorDto convertToDto(DirectorEntity entity);
    DirectorEntity convertToEntity(DirectorDto dto);

    CategoryDto convertToDto(CategoryEntity entity);
    CategoryEntity convertToEntity(CategoryDto dto);

    CommentDto convertToDto(CommentEntity entity);
    CommentEntity convertToEntity(CommentDto dto);

}
