package com.study.ticketing.service;

import com.study.ticketing.Entity.Message;
import com.study.ticketing.repository.MessageRepository;
import com.study.ticketing.service.DTO.MessageDTO;
import com.study.ticketing.service.DTO.MessageMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MessageService {

    private final MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Optional<MessageDTO> getMessage(Long id) {
        return messageRepository.findById(id)
                .map(MessageMapper::toDTO);
    }
}