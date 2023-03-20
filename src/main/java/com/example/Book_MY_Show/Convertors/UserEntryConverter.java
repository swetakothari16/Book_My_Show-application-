package com.example.Book_MY_Show.Convertors;

import com.example.Book_MY_Show.Entities.UserEntity;
import com.example.Book_MY_Show.EntryDtos.UserEntryDto;

public class UserEntryConverter {
    public static UserEntity entryConverter(UserEntryDto userEntityDto) {
        return UserEntity.builder().address(userEntityDto.getAddress()).age(userEntityDto.getAge()).mobNo(userEntityDto.getMobNo()).email(userEntityDto.getEmail()).userName(userEntityDto.getUserName()).build();
    }
}