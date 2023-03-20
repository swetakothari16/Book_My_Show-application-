package com.example.Book_MY_Show.EntryDtos;

import com.example.Book_MY_Show.Enums.Genre;
import com.example.Book_MY_Show.Enums.Language;
import lombok.Data;

@Data
public class MovieEntryDto {
    private String movieName;

    private Language language;

    private Genre genre;

    private Double rating;

    private Double duration;
}