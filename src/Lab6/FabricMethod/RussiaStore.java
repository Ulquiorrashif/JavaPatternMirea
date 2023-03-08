package Lab6.FabricMethod;

public class RussiaStore implements PizzaStore {
    @Override
    public Pizza mackePizza(int a) {
        if(a==0)
            return new Pizza("ru",8);
        if(a==1)
            return new Pizza("ru",16);
        if(a==2)
            return new Pizza("ru",32);
        return null;
    }

}
