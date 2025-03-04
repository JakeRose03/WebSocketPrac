package com.Jake.Chat.config;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class WebSocketEventListener {

    @EventListener
    public void HandleWebSocketDisconnectListener(SessionDisconnect Event event){
        //TODO -> implement noti when user leaves chat
    }


}
