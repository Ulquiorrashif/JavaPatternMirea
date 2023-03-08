package Lab5;

public final class Singleton1 {
    public int zn;
    private static  Singleton1 ob;
    private  static  int count =0;
    private Singleton1(int a){
        zn=a;
    };
    public static Singleton1 getOb(int a){
        if (count==0){
            ob=new Singleton1(a);
            count+=1;
        }
        return  ob;
    }
}
