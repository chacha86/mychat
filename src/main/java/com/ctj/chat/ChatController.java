package com.ctj.chat;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;

@Controller
@RequestMapping("/chat")
@CrossOrigin(origins = "http://localhost:5173")
public class ChatController {

    @Autowired
    private ChatRepository chatRepository;
    @GetMapping("/add")
    @ResponseBody
    public String index(@Valid ChatMessageForm chatMessageForm,
                        BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
            return bindingResult.getAllErrors().toString();
        }
        ChatMessage cm = new ChatMessage();
        cm.setBody(chatMessageForm.getBody());
        LocalDateTime now = LocalDateTime.now();
        cm.setCreateDate(now);
        cm.setUpdateDate(now);
        chatRepository.save(cm);

        return "메시지 등록 성공";
    }

    @GetMapping("/list")
    @ResponseBody
    public String list() {
//        List<ChatMessage> chatList = chatRepository.findAll();
        return "[{\"subject\": \"aaa\"}, {\"subject\": \"bbb\"}]";
    }

}
