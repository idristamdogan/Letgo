package com.idrist.repository;

import com.idrist.entity.Message;


public class MessageRepository extends RepositoryManager<Message, Long>{

    public MessageRepository() {
        super(Message.class);
    }
}
