package Lab7.Facade;

public class SubSystemB {
    private  String name;

    public SubSystemB(String name) {
        this.name = name;
    }
    public void  start (){
        System.out.println(name+"Запустила компоненты");
    }
    public void  stopstart (){
        System.out.println(name+"Отключила компоненты");
    }
}
