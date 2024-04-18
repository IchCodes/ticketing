package com.study.ticketing.service.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MessageDTO {
    private Long id;
    private String text;
    private LocalDate date;
}