package com.nandan.BookMyShowBackend0.Controllers;

import com.nandan.BookMyShowBackend0.Dtos.TheatreRequestDto;
import com.nandan.BookMyShowBackend0.Service.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theatre")
public class TheatreController {

    @Autowired
    TheatreService theatreService;

    @PostMapping("/add")
    public String addTheater(@RequestBody TheatreRequestDto theaterRequestDto){

        return theatreService.createTheater(theaterRequestDto);

    }
}
