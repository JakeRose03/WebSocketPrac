package com.Jake.Chat.controller;





import lombok.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private static final Logger log = LoggerFactory.getLogger(ChatMessage.class);
    private String content;
    private String sender;
    private MessageType type;

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }



}