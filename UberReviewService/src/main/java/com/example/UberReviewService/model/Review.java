package com.example.UberReviewService.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)// create only a single table for all model classes

@Table(name = "bookingreview")
public class Review extends BaseModel {



    @Column(nullable = false)
    private String content;

    @Override
    public String toString() {
        return "review:"+ this.content + " ";
    }
}
