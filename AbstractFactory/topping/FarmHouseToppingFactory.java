package AbstractFactory.topping;

import AbstractFactory.domain.cheese.Cheese;
import AbstractFactory.domain.cheese.MozerellaCheese;

public class FarmHouseToppingFactory extends BaseToppingFactory{
    
    public Cheese getCheese(){
        return new MozerellaCheese();
    } 
}
