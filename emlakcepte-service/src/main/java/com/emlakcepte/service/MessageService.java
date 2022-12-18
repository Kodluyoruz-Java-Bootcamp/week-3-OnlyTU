package com.emlakcepte.service;

import com.emlakcepte.model.Message;
import com.emlakcepte.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public void createMessage(Message message){
        messageRepository.createMessage(message);
    }

    public void deleteMessage(Message message){
        messageRepository.deleteMessage(message);
    }

    public List<Message> findAllMessages(){
        return messageRepository.findAllMessages();
    }
}
