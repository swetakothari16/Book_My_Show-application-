package com.example.Book_MY_Show.Convertors;

import com.example.Book_MY_Show.Entities.MovieEntity;
import com.example.Book_MY_Show.EntryDtos.MovieEntryDto;

public class MovieEntryConverter {
    public static MovieEntity movieEntryConvertor(MovieEntryDto movieDto) {
        return MovieEntity.builder().movieName(movieDto.getMovieName()).duration(movieDto.getDuration()).genre(movieDto.getGenre()).language(movieDto.getLanguage()).rating(movieDto.getRating()).genre(movieDto.getGenre()).build();
    }
}