package com.nandan.BookMyShowBackend0.Models;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "theatre")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor


public class TheatreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;


    private String name;

    private String city;

    private String address;

    //List of shows
    @OneToMany(mappedBy = "theater",cascade = CascadeType.ALL)
    List<ShowEntity> listOfShows;


    //List of theater seats
    @OneToMany(mappedBy = "theater", cascade = CascadeType.ALL)
    List<TheatreSeatEntity> theaterSeatEntityList;
}
