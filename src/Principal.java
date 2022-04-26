
import com.factorymethod.Pizza;
import com.factorymethod.PizzaStore;

public class Principal {
    public static void main(String[] args) {
        PizzaStore ppz = new PizzaStore();
        Pizza pizza  = ppz.orderPizza("Clam");
    }    
}
