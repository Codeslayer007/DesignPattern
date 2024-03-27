package AbstractFactory.topping;

import AbstractFactory.domain.cheese.Cheese;
import AbstractFactory.domain.cheese.PaneerCheese;

public class DesiToppingFactory extends BaseToppingFactory{
        public Cheese getCheese(){
        return new PaneerCheese();
    } 
}
