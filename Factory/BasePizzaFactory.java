package Factory;

import Factory.Domain.Pizza;;

public abstract class BasePizzaFactory {
    
    public abstract Pizza getPizza(String type);
}
