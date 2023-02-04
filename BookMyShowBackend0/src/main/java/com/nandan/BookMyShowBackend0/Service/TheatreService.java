package com.nandan.BookMyShowBackend0.Service;

import com.nandan.BookMyShowBackend0.Dtos.TheatreRequestDto;
import com.nandan.BookMyShowBackend0.Enums.SeatType;
import com.nandan.BookMyShowBackend0.Models.TheatreEntity;
import com.nandan.BookMyShowBackend0.Models.TheatreSeatEntity;
import com.nandan.BookMyShowBackend0.Repository.TheatreRepository;
import com.nandan.BookMyShowBackend0.Repository.TheatreSeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheatreService {

    @Autowired
    TheatreSeatRepository theatreSeatRepository;

    @Autowired
    TheatreRepository theatreRepository;

    public String createTheater(TheatreRequestDto theatreRequestDto){


        TheatreEntity theater = TheatreEntity.builder().city(theatreRequestDto.getCity()).name(theatreRequestDto.getName()).address(theatreRequestDto.getAddress()).build();

        List<TheatreSeatEntity> theaterSeats = createTheaterSeats();


        theater.setTheaterSeatEntityList(theaterSeats); //Bidirectional mapping


        //For each theater Seat : we need to set the theaterEntity
        for(TheatreSeatEntity theaterSeat : theaterSeats){
            theaterSeat.setTheater(theater);
        }

        theatreRepository.save(theater);

        return "Theater added successfully";

    }

    private List<TheatreSeatEntity> createTheaterSeats(){


        List<TheatreSeatEntity> seats = new ArrayList<>();
//
//        TheaterSeatEntity theaterSeat1 = new TheaterSeatEntity("1A", SeatType.CLASSIC,100);
//        TheaterSeatEntity theaterSeat2 = new TheaterSeatEntity("1B", SeatType.CLASSIC,100);
//        TheaterSeatEntity theaterSeat3 = new TheaterSeatEntity("1C", SeatType.CLASSIC,100);
//        TheaterSeatEntity theaterSeat4 = new TheaterSeatEntity("1D", SeatType.CLASSIC,100);
//        TheaterSeatEntity theaterSeat5 = new TheaterSeatEntity("1E", SeatType.CLASSIC,100);

        //Optimize by adding loop

        for(int i=0;i<5;i++){

            char ch = (char)('A'+i);

            String seatNo  = "1"+ ch;
            TheatreSeatEntity theaterSeat = new TheatreSeatEntity(seatNo, SeatType.CLASSIC,100);
            seats.add(theaterSeat);
        }
        for(int i=0;i<5;i++){
            char ch = (char)('A'+i);
            String seatNo  = "2"+ ch;
            TheatreSeatEntity theaterSeat = new TheatreSeatEntity(seatNo,SeatType.PLATINUM,200);
            seats.add(theaterSeat);
        }


//        TheaterSeatEntity theaterSeat6 = new TheaterSeatEntity("2A", SeatType.PLATINUM,200);
//        TheaterSeatEntity theaterSeat7 = new TheaterSeatEntity("2B", SeatType.PLATINUM,200);
//        TheaterSeatEntity theaterSeat8 = new TheaterSeatEntity("2C", SeatType.PLATINUM,200);
//        TheaterSeatEntity theaterSeat9 = new TheaterSeatEntity("2D", SeatType.PLATINUM,200);
//        TheaterSeatEntity theaterSeat10 = new TheaterSeatEntity("2E", SeatType.PLATINUM,200);
//
//
//        seats.add(theaterSeat1);
//        seats.add(theaterSeat2);
//        seats.add(theaterSeat3);
//        seats.add(theaterSeat4);
//        seats.add(theaterSeat5);
//        seats.add(theaterSeat6);
//        seats.add(theaterSeat7);
//        seats.add(theaterSeat8);
//        seats.add(theaterSeat9);
//        seats.add(theaterSeat10);

        theatreSeatRepository.saveAll(seats);

        return seats;

    }

}
