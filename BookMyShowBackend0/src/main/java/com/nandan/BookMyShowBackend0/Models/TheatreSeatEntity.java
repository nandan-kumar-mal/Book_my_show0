package com.nandan.BookMyShowBackend0.Models;


import com.nandan.BookMyShowBackend0.Enums.SeatType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "theatre_seats")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class TheatreSeatEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private int rate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    private TheatreEntity theater;

    public TheatreSeatEntity(String seatNo,SeatType seatType,int rate){
        this.seatNo = seatNo;
        this.seatType = seatType;
        this.rate = rate;
    }
}
