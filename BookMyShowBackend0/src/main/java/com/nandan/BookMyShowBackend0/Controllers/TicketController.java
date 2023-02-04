package com.nandan.BookMyShowBackend0.Controllers;

import com.nandan.BookMyShowBackend0.Dtos.BookTicketRequestDto;
import com.nandan.BookMyShowBackend0.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ticket")
public class TicketController {


    @Autowired
    TicketService ticketService;
    @PostMapping("/book")
    public String bookTicket(@RequestBody BookTicketRequestDto bookTicketRequestDto) {
        try {
            return ticketService.bookTicket(bookTicketRequestDto);
        } catch (Exception e) {
            return "Requested Seats not available";
        }
    }
}
