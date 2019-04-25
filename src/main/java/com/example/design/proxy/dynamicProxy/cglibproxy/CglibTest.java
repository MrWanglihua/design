package com.example.design.proxy.dynamicProxy.cglibproxy;

public class CglibTest {
public static void main(String[] args) {
try {
Customer obj = (Customer)new CGLibMeiPo().getInstance(Customer.class);
obj.findLove();
} catch (Exception e) {
e.printStackTrace();
}
}
}