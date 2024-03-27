package AbstractFactory.domain.pizzas;

import AbstractFactory.topping.BaseToppingFactory;
import AbstractFactory.domain.Pizza;

public class CheesePizza extends Pizza{

    private final BaseToppingFactory toppingFactory;

    public CheesePizza(BaseToppingFactory baseToppingFactory){
        toppingFactory = baseToppingFactory;
    }

    
    public void addIngredients(){
        System.out.println("Adding cheese");
        toppingFactory.getCheese();
    }
}
