package com.study.ticketing.controller;

import com.study.ticketing.service.MessageService;
import com.study.ticketing.service.DTO.MessageDTO;
import com.study.ticketing.service.DTO.MessageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MessageController {

    private final MessageService messageService;

    @GetMapping("message/{id}")
    public MessageDTO getMessage(@PathVariable Long id) {
        return messageService.getMessage(id)
                .orElseGet(() -> {
                    MessageDTO defaultMessage = new MessageDTO();
                    defaultMessage.setText("Default message");
                    // Set other properties of defaultMessage as needed
                    return defaultMessage;
                });
    }
}