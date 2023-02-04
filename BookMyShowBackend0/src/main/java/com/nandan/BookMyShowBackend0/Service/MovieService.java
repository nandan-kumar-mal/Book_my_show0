package com.nandan.BookMyShowBackend0.Service;

import com.nandan.BookMyShowBackend0.Dtos.MovieRequestDto;
import com.nandan.BookMyShowBackend0.Models.MovieEntity;
import com.nandan.BookMyShowBackend0.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;
    public String addMovie(MovieRequestDto movieRequestDto){

        //Convert Dto to Entity layer for saving it to the Database.
        MovieEntity movie = MovieEntity.builder().movieName(movieRequestDto.getName()).duration(movieRequestDto.getDuration()).releaseDate(movieRequestDto.getReleaseDate()).build();

        movieRepository.save(movie);

        return "Movie Added successfully";
    }

}
