package com.example.Book_MY_Show.Entities;

import com.example.Book_MY_Show.Enums.SeatTypes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "theatreSeat")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TheatreSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Enumerated(value = EnumType.STRING)
    private SeatTypes seatType;

    private String seatNo;

    @ManyToOne
    @JoinColumn
    private com.example.Book_MY_Show.Entities.TheatreEntity theatreEntity;
}