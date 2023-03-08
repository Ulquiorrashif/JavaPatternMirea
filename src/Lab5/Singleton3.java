package Lab5;

public class Singleton3 {
    private static Singleton3 ob;
    private Singleton3(){};

    public static Singleton3 getOb(){
        if (ob==null){
            ob=new Singleton3();
            return  ob;
        }
        return ob;
    }
}
