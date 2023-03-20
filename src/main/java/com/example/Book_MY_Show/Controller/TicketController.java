package com.example.Book_MY_Show.Controller;

import com.example.Book_MY_Show.EntryDtos.DeleteTicketEntryDto;
import com.example.Book_MY_Show.EntryDtos.TicketEntryDto;
import com.example.Book_MY_Show.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("ticekt")
public class TicketController {
    @Autowired
    TicketService ticketService;

    @PostMapping("addTicket")
    public ResponseEntity addTicket(@RequestBody TicketEntryDto ticketEntryDto) throws Exception{
        try {
            return ticketService.addTicket(ticketEntryDto);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @DeleteMapping("cancelTicket")
    public ResponseEntity cancelTicket(@RequestBody DeleteTicketEntryDto deleteTicketEntryDto) throws Exception{
        try{
            return ticketService.cancelTicket(deleteTicketEntryDto);
        } catch (Exception e) {
            return new ResponseEntity(e.getMessage().toString(), HttpStatus.BAD_REQUEST);
        }
    }
}