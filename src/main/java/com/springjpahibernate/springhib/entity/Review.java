package com.springjpahibernate.springhib.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.print.DocFlavor;

@Entity
@ToString @Getter @NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue
    private Long id;

    private String rating;

    @Column(nullable = false)
    private String description;

    public Review(String rating, String description) {
        this.rating = rating;
        this.description = description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
