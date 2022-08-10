package com.demo.film.repository;

import com.demo.film.entity.CastEntity;
import com.demo.film.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepo extends JpaRepository<FilmEntity, Integer> {
    List<FilmEntity> findAllByOrderByViewDesc();
    List<FilmEntity> findAllByOrderByViewAsc();
    List<FilmEntity> findAllByOrderByNameDesc();
    List<FilmEntity> findAllByOrderByNameAsc();

    @Query("select c.casts from FilmEntity c where c.id = :id")
    List<CastEntity> findAllCastById(int id);
}
