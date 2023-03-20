package com.example.Book_MY_Show.Repository;

import com.example.Book_MY_Show.Entities.TheatreEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheatreRepository extends JpaRepository<TheatreEntity, Integer> {
}