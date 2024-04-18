package com.study.ticketing.service.DTO;

import com.study.ticketing.Entity.Message;

public class MessageMapper {

    public static MessageDTO toDTO(Message message) {
        MessageDTO dto = new MessageDTO();
        dto.setText(message.getText());
        dto.setDate(message.getDate());
        dto.setAuthor("Hichame");
        dto.setCustomField1("Ce message ne provient pas de la base de données.");
        return dto;
    }

    public static Message toEntity(MessageDTO dto) {
        Message message = new Message();
        message.setText(dto.getText());
        message.setDate(dto.getDate());
        return message;
    }
}