package com.childrenFirstBE.services;

import com.childrenFirstBE.repositories.MessageRepository;
import com.childrenFirstBE.models.Message;
import org.springframework.stereotype.Service;


@Service

public class MessageService {
    private final MessageRepository messageRepository;
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public Message create(Message model) {
        return messageRepository.save(model);
    }

}
