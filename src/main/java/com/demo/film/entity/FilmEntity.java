package com.demo.film.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "film")
@Data
@NoArgsConstructor
public class FilmEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "duration")
    private Integer duration;

    @Column(name = "name")
    private String name;

    @Column(name = "thumbnail")
    private String thumbnail;

    @Column(name = "url")
    private String url;

    @Column(name = "view")
    private Integer view;

    @Column(name = "create_at")
    private Timestamp createAt;

    @Column(name = "update_at")
    private Timestamp updateAt;

    @JsonIgnore
    @ManyToMany()
    @JoinTable(name = "film_cast",
            joinColumns = @JoinColumn(name = "film_id"),
            inverseJoinColumns = @JoinColumn(name = "cast_id")
    )
    private List<CastEntity> casts;

    @ManyToOne() //EAGER
    @JoinColumn(name = "category_id", insertable = false, updatable = false)
    private CategoryEntity category;

    @ManyToOne()
    @JoinColumn(name = "director_id", insertable = false, updatable = false)
    private DirectorEntity director;

    @OneToMany(mappedBy = "film", fetch = FetchType.LAZY)
    private List<CommentEntity> comments;

}