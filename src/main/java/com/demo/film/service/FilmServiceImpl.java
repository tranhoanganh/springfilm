package com.demo.film.service;

import com.demo.film.dto.CastDto;
import com.demo.film.dto.FilmDto;
import com.demo.film.entity.CastEntity;
import com.demo.film.entity.FilmEntity;
import com.demo.film.mapper.MapperDto;
import com.demo.film.repository.CategoryRepo;
import com.demo.film.repository.FilmRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FilmServiceImpl implements FilmService {
    @Autowired
    FilmRepo filmRepo;

    @Autowired
    MapperDto mapperDto;

    @Autowired
    CategoryRepo categoryRepo;

    @Override
    public List<FilmDto> findAllFilm() {
        List<FilmEntity> list = filmRepo.findAll();
        return convertListEntityToDto(list);
    }

    @Override
    public List<FilmDto> listTrending() {
        List<FilmEntity> list = filmRepo.findAllByOrderByViewDesc();
        return convertListEntityToDto(list);
    }

    @Override
    public List<FilmDto> listHot() {
        List<FilmEntity> list = filmRepo.findAllByOrderByViewAsc();
        return convertListEntityToDto(list);
    }

    @Override
    public List<FilmDto> listSuggest() {
        List<FilmEntity> list = filmRepo.findAllByOrderByNameAsc();
        return convertListEntityToDto(list);
    }

    @Override
    public List<FilmDto> listWatch() {
        List<FilmEntity> list = filmRepo.findAllByOrderByNameDesc();
        return convertListEntityToDto(list);
    }

    @Override
    public List<FilmDto> getFilmByCategory(int id) {
        List<FilmEntity> list = categoryRepo.findAllByCategory(id);
        return convertListEntityToDto(list);
    }

    @Override
    public List<CastDto> getAllCastById(int id) {
        List<CastEntity> listEntity = filmRepo.findAllCastById(id);
        List<CastDto> listDto = listEntity.stream()
                .map(x -> {
                    return mapperDto.convertToDto(x);
                })
                .collect(Collectors.toList());
        return listDto;
    }

    private List<FilmDto> convertListEntityToDto(List<FilmEntity> listEntity) {
        List<FilmDto> listDto = listEntity.stream()
                .map(x -> {
                    x.setUrl(null);
//                    x.setCasts(null);
                    return mapperDto.convertToDto(x);
                })
                .collect(Collectors.toList());
        return listDto;
    }

}
