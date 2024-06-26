package com.study.ticketing.repository;

import com.study.ticketing.Entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface MessageRepository extends JpaRepository<Message, Long> {
}
