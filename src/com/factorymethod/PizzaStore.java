package com.factorymethod;

public class PizzaStore {

    public Pizza orderPizza(Pizza pizza) {

        System.out.println("Criando pizza:" + pizza.getClass());
        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;
    }
}
