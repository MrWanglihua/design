package com.example.design.observer.v3;

import com.google.common.eventbus.Subscribe;

public class GuavaEvent {
@Subscribe
public void subscribe(String str){
//业务逻辑
System.out.println("执行 subscribe 方法,传入的参数是:" + str);
}
}