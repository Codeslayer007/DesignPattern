package AbstractFactory.test;

import org.junit.Test;

import AbstractFactory.BasePizzaFactory;
import AbstractFactory.DesiPizzaFactory;
import AbstractFactory.domain.Pizza;

public class UnitTest {
    
    @Test
    public void testCreatePizza() throws Exception {
        BasePizzaFactory pizzaFactory=new DesiPizzaFactory();
        Pizza cheesePizza= pizzaFactory.getPizza("cheese");
        Pizza veggiePizza=pizzaFactory.getPizza("veggie");
    }
}
