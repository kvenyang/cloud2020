package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;

/**
 * @author ：yang
 * @date ：Created in 2020/4/19 21:28
 * @description：测试
 * @modified By：
 * @version: 1.0
 */
public interface PaymentService {
    public int create(Payment payment);
    public Payment getPaymentById(Long id);
}
