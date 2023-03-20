package com.example.Book_MY_Show.Repository;

import com.example.Book_MY_Show.Entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<TicketEntity, Integer> {
}
