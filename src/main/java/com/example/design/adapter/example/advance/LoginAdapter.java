package com.example.design.adapter.example.advance;

import com.example.design.adapter.example.ResultMsg;

public interface LoginAdapter {
    boolean support(Object adapter);

    ResultMsg login(String id, Object adapter);
}