package Lab7.Composite;

import java.util.ArrayList;
import java.util.List;

public class Container implements Component {
    private List<Component> components = new ArrayList<>();
    @Override
    public void draw() {
        for (Component component : components) {
            component.draw();
        }
    }
    @Override
    public void addComponent(Component component) {
        components.add(component);
    }
}