package Lab2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Start {
     private List <Human> mas= new ArrayList<>();
    public void  startHuman(){

        this.mas.add(new Human(18,"Petr","Pefcis", LocalDate.of(2002,8,15),60));
        this.mas.add(new Human(19,"Ivan","Usolsev", LocalDate.of(2003,2,23),62));
        this.mas.add(new Human(21,"Lera","Bortsich", LocalDate.of(2002,6,1),55));
        this.mas.add(new Human(17,"German","Greff", LocalDate.of(2001,10,15),59));

    }
    public void sort(){
        Stream <Human> stream =mas.stream();
        stream.sorted((a,b)->{
            if ((a.getFirstName().compareTo(b.getFirstName()))>0)
                return -1;
            else if ((a.getFirstName().compareTo(b.getFirstName()))<0)
                return 1;
            else
                return 0;
        }
    ).forEach(System.out::println);
    }
    public void filterAge(){
        Stream <Human> stream =mas.stream();
        stream.filter(a->{
            return a.age>20;
        }).forEach(System.out::println);
    }
    public String stringOfName(){
        Stream <Human> stream =mas.stream();

        Optional<String> str= stream.map(a->a.getFirstName()).reduce((a,b)->a+" "+b);
        return str.get();

    }

    public List getElem(){
        Stream <Human> stream =mas.stream();
        List <Human> tmp = new ArrayList<>();
        for (int i=0; i<3;i++ ){
            tmp.add(mas.get(i));
        }
        return tmp;
    }

    public static void main(String[] args) {
        Start start=new Start();
        start.startHuman();
        start.sort();
        System.out.println("---------");
        start.filterAge();
        System.out.println("---------");
        System.out.println(start.stringOfName());
        System.out.println("---------");
        System.out.println( start.getElem().toString());
    }
}
