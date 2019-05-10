package com.example.design.decorator.v3;

public interface ISigninService {
ResultMsg regist(String username, String password);
/**
* 登录的方法
* @param username
* @param password
* @return
*/
ResultMsg login(String username, String password);
}