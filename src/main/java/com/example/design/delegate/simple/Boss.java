package com.example.design.delegate.simple;

public class Boss {
    public void doing(String command,Leader leader){
        leader.doing(command);
    };
}
