package com.example.design.adapter.example.advance;

import com.example.design.adapter.example.ResultMsg;

public class LoginForSinaAdapter implements LoginAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof LoginForSinaAdapter;
    }

    public ResultMsg login(String id, Object adapter) {
        return null;
    }
}