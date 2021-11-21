package com.sahan.csd63.service;

import com.sahan.csd63.dao.BookingRepository;
import com.sahan.csd63.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService {

    @Autowired
    BookingRepository bookingRepository;

    public List<Booking> getAllBookings(){
        return bookingRepository.findAll();
    }

    public Optional<Booking> getBookingByID(int id){
        return bookingRepository.findById(id);
    }

    public int addBooking(Booking booking){
        if(booking != null){
            bookingRepository.save(booking);
            return 1;
        } else {
            return -1;
        }
    }

//    public int updatePost(Post upd_post){
//        if(upd_post != null){
//
//            //Post post = postRepository.findById(upd_post.getId()).get();
//            postRepository.save(upd_post);
//            return 1;
//        } else {
//            return -1;
//        }
//    }

    public int updateBooking(Booking booking){
        if(booking != null){
            if(bookingRepository.findById(booking.getId()).isPresent()) {
                bookingRepository.save(booking);
                return 1;
            } else {
                return 0;
            }
        }
        return -1;
    }


//    public int deletePost(int id){
//        //please do proper validations.
//      if(id > 0){
//          postRepository.deleteById(id);
//          return 1;
//      } else{
//          return -1;
//      }
//    }

    public int deleteBooking(int id){
        if(bookingRepository.findById(id).isPresent()){
            bookingRepository.deleteById(id);
            return 1;
        }

        return -1;
    }


}


