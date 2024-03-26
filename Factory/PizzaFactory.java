package Factory;

import java.util.Objects;

import Factory.Domain.Pizza;
import Factory.Domain.pizzas.CheesePizza;
import Factory.Domain.pizzas.ChickenPizza;
import Factory.Domain.pizzas.VeggiePizza;

public class PizzaFactory extends BasePizzaFactory{

    @Override
    public Pizza getPizza(String type) {
        var result = switch (type) {
            case  "cheese" -> new CheesePizza();
            case  "veggie" -> new VeggiePizza();
            case "chicken" -> new ChickenPizza();
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
