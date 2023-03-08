//Предоставвление интерфейса сложной системы для пользования
//Оградить чтобы не сломать
package Lab7.Facade;

public class Facade {
    private final SubSystemA a;
    private final SubSystemB b;
    private final SubSystemC c;

    public Facade() {
        this.a = new SubSystemA("Подсистема a");
        this.b = new SubSystemB("Подсистема b ");
        this.c = new SubSystemC("Подсистема 'c'");
    }
    public  void go(){
        a.check();
        b.start();
        c.status();
    }
    public  void stop(){
        a.check();
        b.stopstart();
        c.stopstatus();
    }
}
