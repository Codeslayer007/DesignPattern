package Factory.Domain.pizzas;

import Factory.Domain.Pizza;

public class CheesePizza extends Pizza{
    
    public void addIngredients(){
        System.out.println("Adding cheese");
    }
}
