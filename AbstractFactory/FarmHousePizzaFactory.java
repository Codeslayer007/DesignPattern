package AbstractFactory;

import java.util.Objects;

import AbstractFactory.domain.Pizza;
import AbstractFactory.domain.pizzas.CheesePizza;
import AbstractFactory.domain.pizzas.ChickenPizza;
import AbstractFactory.domain.pizzas.VeggiePizza;
import AbstractFactory.topping.BaseToppingFactory;
import AbstractFactory.topping.FarmHouseToppingFactory;


public class FarmHousePizzaFactory extends BasePizzaFactory{
    
    public Pizza getPizza(String type) {
        BaseToppingFactory toppingFactory = new FarmHouseToppingFactory();
        Pizza result = switch (type) {
            case  "cheese" -> new CheesePizza(toppingFactory);
            case  "veggie" -> new VeggiePizza(toppingFactory);
            case "chicken" -> new ChickenPizza(toppingFactory);
            default -> null;
        };
        if(Objects.isNull(result)){
            throw new RuntimeException("no such type");
        }
        result.addIngredients();
        result.bake();
        return result;
    }
}
