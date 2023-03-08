package Lab6;

import Lab6.AbstractFabric.AFabric;
import Lab6.AbstractFabric.Car;
import Lab6.AbstractFabric.Gruz;
import Lab6.AbstractFabric.ToyFab;
import Lab6.Builder.Human;
import Lab6.Builder.HumanBuilder;
import Lab6.FabricMethod.Pizza;
import Lab6.FabricMethod.PizzaStore;
import Lab6.FabricMethod.RussiaStore;
import Lab6.Proto.Cloneclass;

public class Start {
    public static void main(String[] args) {
        Human hu = new HumanBuilder(12,true).build();
        System.out.println(hu);
        System.out.println("-----------");
        PizzaStore ru = new RussiaStore();
        Pizza p = ru.mackePizza(1);
        System.out.println(p.toString());
        System.out.println("-----------");
        Cloneclass c=new Cloneclass(1,2,"bobik");
        Cloneclass c1 =(Cloneclass) c.clone();
        System.out.println(c.toString());
        System.out.println(c1.toString());
        System.out.println("-----------");
        AFabric fab = new ToyFab();
        Car car1 = fab.mackeCar();
        Gruz car2 = fab.mackeGruz();
        car1.run();
        car2.run();



    }
}
