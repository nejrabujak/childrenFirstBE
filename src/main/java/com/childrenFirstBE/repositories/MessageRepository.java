package com.childrenFirstBE.repositories;

import com.childrenFirstBE.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {
}
