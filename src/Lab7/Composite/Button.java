package Lab7.Composite;

public class Button implements Component {
    @Override
    public void draw() {
        System.out.println("Отрисовка кнопки");
    }

    @Override
    public void addComponent(Component component) {
        throw new UnsupportedOperationException();
    }
}
