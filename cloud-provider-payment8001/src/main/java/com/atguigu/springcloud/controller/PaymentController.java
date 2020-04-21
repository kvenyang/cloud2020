package com.atguigu.springcloud.controller;/**
 * @author ：yang
 * @date ：Created in 2020/4/19 22:24
 * @description：测试
 * @modified By：
 * @version: 1.0
 */

import com.atguigu.springcloud.entities.Payment;
import com.atguigu.springcloud.service.PaymentService;
import com.atguigu.springcloud.utils.CommonResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author     ：yang
 * @date       ：Created in 2020/4/19 22:24
 * @description：测试
 * @modified By：
 * @version: 1.0
 */
@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;
    @PostMapping(value = "/payment/creat")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);
        if(result > 0){
            return new CommonResult(200,"插入成功！",result);
        }else {
            return new CommonResult(404,"插入数据失败",null);
        }
    }
    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long id){
        Payment result = paymentService.getPaymentById(id);
        if(result != null){
            return new CommonResult(200,"查询成功！",result);
        }else {
            return new CommonResult(404,"插入数据失败",null);
        }
    }
}
