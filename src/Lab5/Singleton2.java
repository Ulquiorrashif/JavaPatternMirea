package Lab5;

public class Singleton2 {
    private int pol;
    public final static Singleton2 ob = new Singleton2();
    private Singleton2(){};
    public void setPol(int a){
        ob.pol=a;
    }

    public int getPol() {
        return pol;
    }
}
