package com.ujiuye.cus.controller;

import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/cus")
public class CusController {

//    @Autowired
//    CustomerService customerService;
//
//    @RequestMapping("/showAllCustomer")
//    @ResponseBody
//    public List<Customer> showAll(String key){
//        System.out.println(key);
//        List<Customer> list = customerService.showAllCustomer();
//        return list;
//    }
}
