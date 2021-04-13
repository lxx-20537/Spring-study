package com.lxx.demo1;

public class Proxy implements Rent {
    private  Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host = host;
    }

    public void rent() {
        seeHouse();
        host.rent();
        fee();
        heTong();
    }
    public void seeHouse(){
        System.out.println("中介带你看房！");
    }
    public  void fee(){
        System.out.println("索要中介费！");
    }
    public  void  heTong(){
        System.out.println("签合同！");
    }
}
