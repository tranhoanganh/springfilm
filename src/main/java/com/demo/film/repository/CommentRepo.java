package com.demo.film.repository;

import com.demo.film.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepo extends JpaRepository<CommentEntity, Integer> {

}
