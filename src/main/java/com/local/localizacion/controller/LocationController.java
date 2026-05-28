package com.local.localizacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

import com.local.localizacion.model.LocationMessage;

@Controller
public class LocationController {
    
    @Autowired
    private SimpMessagingTemplate messagingTemplate;
    
    @MessageMapping("/send-location")
    public void handleLocation(@Payload LocationMessage location) {
        // Enviar a todos los que estén suscritos al emisor específico
        messagingTemplate.convertAndSend("/topic/location/" + location.getEmisorId(), location);
    }
}