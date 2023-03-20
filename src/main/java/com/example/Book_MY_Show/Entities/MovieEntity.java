package com.example.Book_MY_Show.Entities;

import com.example.Book_MY_Show.Enums.Genre;
import com.example.Book_MY_Show.Enums.Language;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Type;
import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "movie")
public class MovieEntity {
    @Id
    private String movieName;

    @OneToMany(mappedBy = "movieEntity", cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList;

    @JoinColumn
    @ManyToOne
    TheatreEntity theatreEntity;

    @Enumerated(value = EnumType.STRING)
    private Language language;

    @Enumerated(value = EnumType.STRING)
    private Genre genre;

    private Double rating;

    private Double duration;

}