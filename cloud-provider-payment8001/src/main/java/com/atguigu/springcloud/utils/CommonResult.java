package com.atguigu.springcloud.utils;/**
 * @author ：yang
 * @date ：Created in 2020/4/19 21:16
 * @description：公共返回方法
 * @modified By：
 * @version: 1.0
 */

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author     ：yang
 * @date       ：Created in 2020/4/19 21:16
 * @description：公共返回方法
 * @modified By：
 * @version: 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult <T>{
    private Integer code;
    private String message;
    private T data;
    public CommonResult(Integer code,String message){
       this.code = code;
       this.message = message;
    }
}
