package com.example.Book_MY_Show.Service;

import com.example.Book_MY_Show.Convertors.MovieEntryConverter;
import com.example.Book_MY_Show.Entities.MovieEntity;
import com.example.Book_MY_Show.EntryDtos.MovieEntryDto;
import com.example.Book_MY_Show.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieEntryDto movieEntryDto) {
        MovieEntity movie = MovieEntryConverter.movieEntryConvertor(movieEntryDto);
        movieRepository.save(movie);
        return "Successfully Added";
    }
}