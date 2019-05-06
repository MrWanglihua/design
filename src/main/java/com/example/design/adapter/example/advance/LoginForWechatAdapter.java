package com.example.design.adapter.example.advance;

import com.example.design.adapter.example.ResultMsg;

public class LoginForWechatAdapter implements LoginAdapter {
public boolean support(Object adapter) {
return adapter instanceof LoginForWechatAdapter;
}
public ResultMsg login(String id, Object adapter) {
return null;
}
}