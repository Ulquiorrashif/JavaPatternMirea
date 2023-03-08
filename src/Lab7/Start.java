package Lab7;

import Lab7.Composite.Button;
import Lab7.Composite.Component;
import Lab7.Composite.Container;
import Lab7.Composite.Label;
import Lab7.Facade.Facade;

public class Start {
    public static void main(String[] args) {
        Facade sys = new Facade();
        sys.go();
        sys.stop();
        System.out.println("_________");
        Component page = new Container();
        Component cont = new Container();
        cont.addComponent(new Label());
        cont.addComponent(new Button());
        page.addComponent(cont);
        page.addComponent(new Button());
        page.addComponent(new Label());


        page.draw();
    }


}
