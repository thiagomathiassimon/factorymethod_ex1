import com.factorymethod.Pizza;
import com.factorymethod.PizzaFactory;
import com.factorymethod.PizzaStore;

import java.util.Objects;

public class Principal {
    public static void main(String[] args) {
        PizzaStore ppz = new PizzaStore();
        Pizza pizza = ppz.orderPizza(Objects.requireNonNull(PizzaFactory.createPizza("cheese")));

        System.out.println(pizza.toString());

    }
}
