package com.lxx.diy;

//自定义一个切面
public class DiyPointCut {
    public  void  before(){
        System.out.println("===方法执行前===");
    }
    public  void  after(){
        System.out.println("===方法执行后===");
    }
}
