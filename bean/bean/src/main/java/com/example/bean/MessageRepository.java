package com.example.bean;

import org.springframework.stereotype.Component;

@Component
public class MessageRepository {

    public String findMessage() {
        return "Message loaded by the repository";
    }
}
