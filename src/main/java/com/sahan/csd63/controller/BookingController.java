package com.sahan.csd63.controller;

import com.sahan.csd63.model.Booking;
import com.sahan.csd63.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllPosts(){
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getPostById(@PathVariable("id") int id){
        return bookingService.getBookingByID(id).get(); //TODO:later availability checking
    }

    @PostMapping("/add")
    public int addPost(@RequestBody Booking booking){
        return bookingService.addBooking(booking);
    }

    @PutMapping("/update")
    public int updatePost(@RequestBody Booking booking){
        return bookingService.updateBooking(booking);
    }

    @DeleteMapping("/{id}")
    public int deletePostById(@PathVariable("id") int id){
        return bookingService.deleteBooking(id);
    }

}


