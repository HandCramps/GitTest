package com.ujiuye.cus.service;

import com.ujiuye.cus.bean.Customer;
import com.ujiuye.cus.bean.CustomerVo;
import com.ujiuye.cus.mapper.CustomerMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerServiceImpl implements  CustomerService {
    @Resource
    private CustomerMapper customerMapper;

    @Override
    public List<Customer> showAllCustomer() {
        return customerMapper.showAllCustomer();
    }

    /**
     *
     *  保存我们的客户信息
     * @param customer
     * @return
     */
    @Override
    public boolean saveCustomer(Customer customer) {
        if(customer.getId()!=null){
            return customerMapper.updateByPrimaryKey(customer)>0;
        }else{
            return customerMapper.insert(customer)>0;
        }
    }
   /* @Override
    public boolean updateCustomer(Customer customer) {
        return customerMapper.updateByPrimaryKey(customer)>0;
    }*/

    /**
     * 展示客户的信息
     * @return
     */
    @Override
    public List<Customer> showAll(CustomerVo vo) {
        return customerMapper.getAllInfo(vo);
    }

    /**
     * 批量删除用户信息
     * @param ids
     * @return
     */
    @Override
    public boolean batchDelete(Integer[] ids) {
        // 将数组转化成了集合
        return customerMapper.batchDelete(ids)>0;
    }

    /**
     * 根据用户id查询用户信息
     * @param cid
     * @return
     */
    @Override
    public Customer getOneByCid(Integer cid) {
        return customerMapper.selectByPrimaryKey(cid);
    }
}
