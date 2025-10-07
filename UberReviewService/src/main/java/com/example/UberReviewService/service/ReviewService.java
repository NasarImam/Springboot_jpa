package com.example.UberReviewService.service;

import com.example.UberReviewService.model.Booking;
import com.example.UberReviewService.model.Review;
import com.example.UberReviewService.repositories.BookingRepository;
import com.example.UberReviewService.repositories.ReviewRepository;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service

public class ReviewService implements CommandLineRunner {

    private ReviewRepository reviewRepository;
    private  BookingRepository bookingRepository;

    //constructor injection
    public ReviewService(ReviewRepository reviewRepository, BookingRepository bookingRepository){
        this.reviewRepository=reviewRepository;
        this.bookingRepository=bookingRepository;
    }


    @Override
    public void run(String... args) throws Exception{
        System.out.println("********");
        Review r= Review.builder().content("Amazon ride quality").build();// code to create plain java object
        Booking b= Booking.builder().review(r).endTime(new Date()).build();
        r.setCreatedAt(new Date());
        r.setUpdatedAt(new Date());
        reviewRepository.save(r); // execute sql query
        bookingRepository.save(b);
        System.out.println(r);
        System.out.println(r.getContent());
        List<Review> reviews =reviewRepository.findAll();

        for(Review review: reviews){
            System.out.println(review.getContent());
        }

    }
}
