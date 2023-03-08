package Lab7.Facade;

public class SubSystemC {
    private  String name;

    public SubSystemC(String name) {
        this.name = name;
    }
    public void  status(){
        System.out.println(name+"отслеживает статус");
    }
    public void  stopstatus(){
        System.out.println(name+" не отслеживает статус ");
    }
}
