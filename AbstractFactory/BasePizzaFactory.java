package AbstractFactory;

import AbstractFactory.domain.Pizza;

public abstract class BasePizzaFactory {
    
    public abstract Pizza getPizza(String type);
}
