package com.example.design.adapter.example.advance;

import com.example.design.adapter.example.ResultMsg;

public class LoginForTokenAdapter implements LoginAdapter {
public boolean support(Object adapter) {
return adapter instanceof LoginForTokenAdapter;
}
public ResultMsg login(String id, Object adapter) {
return null;
}
}