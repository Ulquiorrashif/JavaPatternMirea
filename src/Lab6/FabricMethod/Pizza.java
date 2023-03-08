package Lab6.FabricMethod;

public class Pizza {
    private  String made;
    private  int r;

    public Pizza(String made, int r) {
        this.made = made;
        this.r = r;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "made='" + made + '\'' +
                ", r=" + r +
                '}';
    }
}
