package com.example.UberReviewService.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;


import java.security.PrivateKey;
import java.util.Date;
@Builder

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Booking extends BaseModel{

    // so when ever we try to create has a relation-ship between entity to entity class we must define relations like one-to-one manytoone etc
    @OneToOne
    private Review review;

    // default value for enum is tinyint
    @Enumerated(value = EnumType.STRING)
    private BookingStatus bookingStatus;

    // First we need to count the start time of the booking
    @Temporal(value= TemporalType.TIMESTAMP)
    private Date startTime;



    @Temporal(value= TemporalType.TIMESTAMP)
    private Date endTime;

    private Long totalDistance;

    @ManyToOne
    private Driver driver;


}
