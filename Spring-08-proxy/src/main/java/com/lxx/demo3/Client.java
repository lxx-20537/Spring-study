package com.lxx.demo3;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        UserServiceProxy userServiceProxy =new UserServiceProxy(userService);
        userServiceProxy.add();
    }
}
