package com.example.design.adapter.example.advance;

import com.example.design.adapter.example.ResultMsg;

public class LoginForTelAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForTelAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}