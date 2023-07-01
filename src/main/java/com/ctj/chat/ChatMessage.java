package com.ctj.chat;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
public class ChatMessage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String body;

    @ManyToOne(cascade = CascadeType.REMOVE)
    private ChatUser user;

    private LocalDateTime updateDate;
    private LocalDateTime createDate;

}
