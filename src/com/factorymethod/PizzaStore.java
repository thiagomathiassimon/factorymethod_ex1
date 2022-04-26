package com.factorymethod;

public class PizzaStore {

    /**
     * Cria uma pizza a partir do tipo especificado.
     * @param type Tipo da piza.
     * @return Pizza selecionada.
     */
    public Pizza orderPizza(String type) {
        // Agora estamos pensando o tipo de pizza para orderPizza
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
            //} else if (type.eguals("greek")){
            //	 pizza = new GreekPizza();  
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("Veggie")) {
            pizza = new VeggiePizza();
            // Com base no tipo de pizza, instanciamos a classe concreta correta e a atribuímos à variáveis de instância de pizza. Observe que cada pizza aqui tem que implementar a interface Pizza
        } else if (type.equals("Clam")) {
            pizza = new ClamPizza();
        }

        System.out.println("Criando pizza:" + type);
        pizza.prepare();

        pizza.bake();

        pizza.cut();

        pizza.box();

        return pizza;

    }
}
