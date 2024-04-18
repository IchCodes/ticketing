package com.study.ticketing.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Table(name = "message")
@Entity
@Getter
@Setter
public class Message {
    @Id
    private Long id;
    private String text;
    private LocalDate date;


}
