package com.factorymethod;

public class PizzaFactory<T> {

    public static Pizza createPizza(String type) {
        if (!type.trim().isEmpty()) {
            switch (type.trim().toUpperCase()) {
                case "CHEESE":
                    return new CheesePizza();
                case "CLAM":
                    return new ClamPizza();
                case "VEGGIE":
                    return new VeggiePizza();
            }
        }
        return null;
    }

}
