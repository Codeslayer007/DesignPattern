package Factory.Domain;

public abstract class Pizza {

    public abstract void addIngredients();
    
    public void bake(){
        System.out.println("Baking pizza");
    }
}