package com.ujiuye.cus.service;

import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.bean.CustomerVo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {

    public List<Customer> showAllCustomer();

    public  boolean  saveCustomer(Customer customer);

    public List<Customer> showAll(CustomerVo vo);

    public boolean  batchDelete(Integer[] ids);

    public Customer  getOneByCid(Integer cid);

}
