package AbstractFactory.domain.pizzas;

import AbstractFactory.domain.Pizza;
import AbstractFactory.topping.BaseToppingFactory;


public class ChickenPizza extends Pizza{
    
    private final BaseToppingFactory toppingFactory;

    public ChickenPizza(BaseToppingFactory baseToppingFactory){
        toppingFactory = baseToppingFactory;
    }

    public void addIngredients(){
        System.out.println("adding chicken");
        toppingFactory.getCheese();
    }
}
