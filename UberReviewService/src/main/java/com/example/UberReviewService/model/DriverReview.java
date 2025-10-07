package com.example.UberReviewService.model;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity

public class DriverReview extends Review{
    private String driverReviewComment;
}
