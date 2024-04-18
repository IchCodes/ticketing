package com.study.ticketing.service.DTO;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class MessageDTO {
    private String text;
    private LocalDate date;
    private String author;
    private String customField1;
}