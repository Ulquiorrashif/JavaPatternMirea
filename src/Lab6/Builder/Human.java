package Lab6.Builder;

public class Human {
    private final String Name;
    private final String Forname;
    private final int Alt;
    private final boolean pol;


    public Human(HumanBuilder builder) {
        Name = builder.getName();
        Forname = builder.getForname();
        Alt = builder.getAlt();
        this.pol = builder.isPol();
    }

    public String getName() {
        return Name;
    }

    public String getForname() {
        return Forname;
    }

    public int getAlt() {
        return Alt;
    }

    public boolean isPol() {
        return pol;
    }

    @Override
    public String toString() {
        return "Human{" +
                "Name='" + Name + '\'' +
                ", Forname='" + Forname + '\'' +
                ", Alt=" + Alt +
                ", pol=" + pol +
                '}';
    }
}
