package Lab6.Builder;

public class HumanBuilder {
    private  String Name;
    private  String Forname;
    private  int Alt;
    private  boolean pol;

    public  HumanBuilder(int alt, boolean pol) {
        Alt = alt;
        this.pol = pol;
    }

    public HumanBuilder setName(String name) {
        Name = name;
        return this;
    }

    public HumanBuilder setForname(String forname) {
        Forname = forname;
        return this;
    }

    public HumanBuilder setAlt(int alt) {
        Alt = alt;
        return this;
    }

    public HumanBuilder setPol(boolean pol) {
        this.pol = pol;
        return this;
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

    public Human build(){
        return new Human(this);
    }
}
