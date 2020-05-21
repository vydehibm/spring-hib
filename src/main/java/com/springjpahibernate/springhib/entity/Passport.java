package com.springjpahibernate.springhib.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@ToString
@Getter
@NoArgsConstructor
public class Passport {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String number;


    public Passport(String number) {
        this.number = number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
