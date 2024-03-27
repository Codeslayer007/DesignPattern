package AbstractFactory.domain.pizzas;

import AbstractFactory.topping.BaseToppingFactory;
import AbstractFactory.domain.Pizza;

public class VeggiePizza extends Pizza{

    private final BaseToppingFactory toppingFactory;

    public VeggiePizza(BaseToppingFactory baseToppingFactory){
        toppingFactory = baseToppingFactory;
    }
    
    public void addIngredients(){
        System.out.println("add veggies");
        toppingFactory.getCheese();
    }

    
}
