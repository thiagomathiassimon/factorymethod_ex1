package com.factorymethod;

public class CheesePizza implements Pizza {

    @Override
    public void prepare() {
        System.out.println("Preparando");
    }

    @Override
    public void bake() {
        System.out.println("Assando");
    }

    @Override
    public void cut() {
        System.out.println("Cortando");
    }

    @Override
    public void box() {
        System.out.println("Na caixa");
    }

    @Override
    public String toString() {
        return "CheesePizza{}";
    }
}
