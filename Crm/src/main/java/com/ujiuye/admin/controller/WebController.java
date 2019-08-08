package com.ujiuye.admin.controller;

import com.ujiuye.util.Message;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class WebController {

    @RequestMapping("/login")
    @ResponseBody
    public Message index(String key){
        
        System.out.println(key);
        Message message = new Message();
        message.setCode(0);
        message.setMsgInfo("success");
        message.setMsgDetail("登陆成功");

        return message;
    }
}
