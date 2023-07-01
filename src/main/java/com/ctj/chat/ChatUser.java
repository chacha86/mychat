package com.ctj.chat;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
public class ChatUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 30)
    private String nickname;
    private String passwd;
    private LocalDateTime updateDate;
    private LocalDateTime createDate;

}
