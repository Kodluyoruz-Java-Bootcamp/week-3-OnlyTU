package com.emlakcepte.controller;

import com.emlakcepte.model.Message;
import com.emlakcepte.service.MessageService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/messages")
public class MessageController {

    //GET /messages
    @GetMapping
    public ResponseEntity<List<Message>> getAll(){
        MessageService messageService = new MessageService();
        return new ResponseEntity<>(messageService.findAllMessages(),HttpStatus.OK);
    }
    //POST /messages
    @PostMapping
    public ResponseEntity<Message> create(@RequestBody Message message){
        MessageService messageService = new MessageService();
        messageService.createMessage(message);
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }
    @DeleteMapping
    public ResponseEntity<Message> delete(Message message){
        MessageService messageService = new MessageService();
        messageService.deleteMessage(message);
        return new ResponseEntity<>(message,HttpStatus.OK);
    }
}
