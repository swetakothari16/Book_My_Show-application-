package com.example.Book_MY_Show.Repository;

import com.example.Book_MY_Show.Entities.MovieEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<MovieEntity, String> {
}