package com.atguigu.springcloud.service.impl;/**
 * @author ：yang
 * @date ：Created in 2020/4/19 21:30
 * @description：ce
 * @modified By：
 * @version: 1
 */

import com.atguigu.springcloud.dao.PaymentDao;
import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author     ：yang
 * @date       ：Created in 2020/4/19 21:30
 * @description：ce
 * @modified By：
 * @version: 1
 */
@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
