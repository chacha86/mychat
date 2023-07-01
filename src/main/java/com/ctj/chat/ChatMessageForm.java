package com.ctj.chat;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data

public class ChatMessageForm {
    @NotEmpty(message = "내용을 입력해주세요.")
    private String body;

}
