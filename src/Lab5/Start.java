package Lab5;

public class Start {
    public static void main(String[] args) {
        Singleton1 s11=Singleton1.getOb(1);
        Singleton1 s12=Singleton1.getOb(2);
        System.out.println(s11);
        System.out.println(s12);
        Singleton3 s31=Singleton3.getOb();
        Singleton3 s32=Singleton3.getOb();
        System.out.println(s31);
        System.out.println(s32);
        Singleton2 s21=Singleton2.ob;
        Singleton2 s22=Singleton2.ob;
        s21.setPol(1);
        s22.setPol(2);
        System.out.println(s21);
        System.out.println(s22);
        System.out.println(s21.getPol());
        System.out.println(s22.getPol());





    }
}
