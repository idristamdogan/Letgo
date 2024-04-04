package com.idrist.service;

import com.idrist.repository.MessageRepository;

public class MessageService {
    MessageRepository messageRepository;

    public MessageService() {
        this.messageRepository =new MessageRepository();
    }
}
