package com.example.design.proxy.staticProxy.test;

import com.example.design.proxy.dynamicProxy.source.OrderServiceDynamicProxy;
import com.example.design.proxy.staticProxy.demo.IOrderService;
import com.example.design.proxy.staticProxy.demo.Order;
import com.example.design.proxy.staticProxy.demo.OrderService;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DBRoutProxyTest {
    public static void main(String[] args) {
        try {
            Order order = new Order();
            // Date today = new Date();
            // order.setCreateTime(today.getTime());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
            Date date = sdf.parse("2018/02/01");
            order.setCreateTime(date.getTime());
            IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
            orderService.createOrder(order);
        }catch (Exception e){
            e.printStackTrace();;
        }
    }
}