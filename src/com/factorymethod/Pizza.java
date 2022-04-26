package com.factorymethod;

public class Pizza {

    public void prepare() {
        System.out.println("Preparando");
    }

    public void bake() {
        System.out.println("Assando");
    }

    public void cut() {
        System.out.println("Cortando");
    }

    public void box() {
        System.out.println("Na caixa");
    }
}
