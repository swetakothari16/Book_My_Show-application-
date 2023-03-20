package com.example.Book_MY_Show.Service;

import com.example.Book_MY_Show.Convertors.UserEntryConverter;
import com.example.Book_MY_Show.Entities.UserEntity;
import com.example.Book_MY_Show.EntryDtos.UserEntryDto;
import com.example.Book_MY_Show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public String addUser(UserEntryDto userEntryDto) {

        UserEntity user;
        user = UserEntryConverter.entryConverter(userEntryDto);
        userRepository.save(user);
        return "User Added Successfully";
    }
}