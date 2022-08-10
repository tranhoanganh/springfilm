package com.demo.film.repository;

import com.demo.film.entity.CategoryEntity;
import com.demo.film.entity.FilmEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepo extends JpaRepository<CategoryEntity, Integer> {

    @Query("select c.films from CategoryEntity c where c.id = :id")
    List<FilmEntity> findAllByCategory(int id);
}
