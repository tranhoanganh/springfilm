package com.demo.film.service;

import com.demo.film.dto.CommentDto;

import java.util.List;

public interface CommentService {
    List<CommentDto> getAllComment();
    CommentDto postComment(CommentDto commentDto);
}
