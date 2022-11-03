package com.example.messaging;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/api")
public class MessageController {

    private final MessageSender sender;

    public MessageController(MessageSender sender) {
        this.sender = sender;
    }

    @GetMapping("/send")
    public void sendMessage(@RequestParam("message") String message) {
        sender.send(message);
    }
}
