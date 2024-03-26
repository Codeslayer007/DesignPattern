package Factory.Test;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Factory.BasePizzaFactory;
import Factory.PizzaFactory;
import Factory.Domain.Pizza;
import Factory.Domain.pizzas.CheesePizza;
import Factory.Domain.pizzas.ChickenPizza;
import Factory.Domain.pizzas.VeggiePizza;

public class UnitTest {
    
     @Test
    public void testGetPizza() {
        BasePizzaFactory pizzaStore = new PizzaFactory();

        // Test for cheese pizza
        Pizza cheesePizza = pizzaStore.getPizza("cheese");
        assertNotNull(cheesePizza);
        assertTrue(cheesePizza instanceof CheesePizza);

        // Test for veggie pizza
        Pizza veggiePizza = pizzaStore.getPizza("veggie");
        assertNotNull(veggiePizza);
        assertTrue(veggiePizza instanceof VeggiePizza);

        // Test for chicken pizza
        Pizza chickenPizza = pizzaStore.getPizza("chicken");
        assertNotNull(chickenPizza);
        assertTrue(chickenPizza instanceof ChickenPizza);

        // Test for invalid pizza type
        assertThrows(RuntimeException.class, () -> pizzaStore.getPizza("invalid"));
    }
}
