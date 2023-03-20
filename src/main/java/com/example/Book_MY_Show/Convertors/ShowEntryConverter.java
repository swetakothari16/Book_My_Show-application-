package com.example.Book_MY_Show.Convertors;

import com.example.Book_MY_Show.Entities.ShowEntity;
import com.example.Book_MY_Show.EntryDtos.ShowEntryDto;

public class ShowEntryConverter {
    public static ShowEntity entryConverter(ShowEntryDto showEntryDto) {
        return ShowEntity.builder().localTime(showEntryDto.getLocalTime()).localDate(showEntryDto.getLocalDate()).showType(showEntryDto.getShowType()).seatPrice(showEntryDto.getSeatPrice()).build();
    }
}