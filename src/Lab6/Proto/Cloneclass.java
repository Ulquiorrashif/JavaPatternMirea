package Lab6.Proto;

public class Cloneclass implements Prototype {
    private int a;
    private int b;
    private String name;

    public Cloneclass(int a, int b, String name) {
        this.a = a;
        this.b = b;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Cloneclass{" +
                "a=" + a +
                ", b=" + b +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Object clone() {
        return new Cloneclass(a,b,name);
    }
}
