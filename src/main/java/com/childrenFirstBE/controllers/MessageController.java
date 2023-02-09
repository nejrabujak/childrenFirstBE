package com.childrenFirstBE.controllers;

import com.childrenFirstBE.services.MessageService;
import com.childrenFirstBE.models.Message;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/message")

public class MessageController {
    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }


    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return messageService.create(message);
    }
}
