package com.example.Book_MY_Show.Convertors;

import com.example.Book_MY_Show.Entities.TheatreEntity;
import com.example.Book_MY_Show.EntryDtos.TheatreEntryDto;

public class TheatreEntryConverter {
    public static TheatreEntity entryConverter(TheatreEntryDto theatreEntryDto) {
        return TheatreEntity.builder().theatreName(theatreEntryDto.getTheatreName()).location(theatreEntryDto.getLocation()).build();
    }
}