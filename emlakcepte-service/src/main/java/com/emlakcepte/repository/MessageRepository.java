package com.emlakcepte.repository;

import com.emlakcepte.model.Message;
import org.springframework.stereotype.Repository;


import java.util.ArrayList;
import java.util.List;

@Repository
public class MessageRepository {

    private static List<Message> messageList = new ArrayList<>();

    public void createMessage(Message message){
        messageList.add(message);
    }

    public List<Message> findAllMessages(){
        return messageList;
    }

    public void deleteMessage(Message message) {
        messageList.remove(message);
    }
}
