package Lab6.AbstractFabric;

public class ToyFab implements AFabric{
    @Override
    public Car mackeCar() {
        return new LegCarToy();
    }

    @Override
    public Gruz mackeGruz() {
        return new GruzToy();
    }
}
