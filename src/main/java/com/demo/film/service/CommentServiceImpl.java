package com.demo.film.service;

import com.demo.film.dto.CommentDto;
import com.demo.film.entity.CommentEntity;
import com.demo.film.mapper.MapperDto;
import com.demo.film.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    CommentRepo commentRepo;

    @Autowired
    MapperDto mapperDto;

    @Override
    public List<CommentDto> getAllComment() {
        List<CommentEntity> listEntity = commentRepo.findAll();
        List<CommentDto> listDto = listEntity.stream()
                .map(x -> {
                    x.getUser().setRole(null);
                    return mapperDto.convertToDto(x);
                })
                .collect(Collectors.toList());
        return listDto;
    }

    @Override
    public CommentDto postComment(CommentDto commentDto) {
        CommentEntity commentEntity = mapperDto.convertToEntity(commentDto);
        CommentEntity cm = commentRepo.save(commentEntity);
        CommentDto res = mapperDto.convertToDto(cm);
        return res;
    }
}
