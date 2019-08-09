package com.ujiuye.admin.controller;

import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.service.CustomerService;
import com.ujiuye.util.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class WebController {

    @Autowired
    CustomerService customerService;

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

    @RequestMapping(value = "/showCustomer",method = {RequestMethod.GET})
    @ResponseBody
    public List<Customer> showCustomer(){
        return customerService.showAllCustomer();
    }

    @RequestMapping(value = "/addCustomer",method = {RequestMethod.POST})
    @ResponseBody
    public Message addCustomer(Customer customer){
        Message message = new Message();
        if (customerService.saveCustomer(customer)){
            message.setCode(0);
            message.setMsgInfo("success");
            message.setMsgDetail("添加成功");
        }
        return message;
    }
}
