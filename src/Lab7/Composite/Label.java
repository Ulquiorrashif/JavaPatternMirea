package Lab7.Composite;

public class Label implements Component {
    @Override
    public void draw() {
        System.out.println("Отрисовка текстового поля");
    }

    @Override
    public void addComponent(Component component) {

    }
}
