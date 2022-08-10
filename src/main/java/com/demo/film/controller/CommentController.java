package com.demo.film.controller;

import com.demo.film.dto.BaseResponse;
import com.demo.film.dto.CommentDto;
import com.demo.film.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping
    public ResponseEntity getAllComment() {
        BaseResponse res = new BaseResponse<>();
        res.data = commentService.getAllComment();
        return ResponseEntity.ok(res);
    }

    @PostMapping
    public ResponseEntity postComment(@RequestBody CommentDto commentDto) {
        BaseResponse res = new BaseResponse<>();
        res.data = commentService.postComment(commentDto);
        return ResponseEntity.ok(res);
    }
}
