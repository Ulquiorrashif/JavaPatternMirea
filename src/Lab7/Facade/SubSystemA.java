package Lab7.Facade;

public class SubSystemA {
    private  String name;

    public SubSystemA(String name) {
        this.name = name;
    }
    public void  check(){
        System.out.println(name);
    }
}
