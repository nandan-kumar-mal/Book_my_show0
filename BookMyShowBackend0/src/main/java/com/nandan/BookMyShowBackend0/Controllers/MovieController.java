package com.nandan.BookMyShowBackend0.Controllers;

import com.nandan.BookMyShowBackend0.Dtos.MovieRequestDto;
import com.nandan.BookMyShowBackend0.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {


    @Autowired
    MovieService movieService;
    @PostMapping("/add")
    public String addMovie(@RequestBody MovieRequestDto movieRequestDto){

        return movieService.addMovie(movieRequestDto);
    }

}
