package Lab3;

import java.lang.reflect.Array;
import java.util.*;

public class Start {
    public static void main(String[] args) {
        List listone = new ArrayList(Arrays.asList(0,1,2,3,4));
        List listtwo = new ArrayList(Arrays.asList(5,6,7,8,9));
        Set setone = new TreeSet<>(listone);
        Set settwo = new TreeSet<>(listtwo);
        MySet mysetone = new MySet(listone);
        MySet mysettwo = new MySet(listtwo);
        MyList myList = new MyList();
        List list = new ArrayList<>();
        Thread one = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                list.add(listone.get(i));

            }
        });
        Thread two = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                list.add(listtwo.get(i));

            }
        });
        Thread thre = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                myList.add(listone.get(i));

            }
        });
        Thread chet = new Thread(()->{
            for (int i = 0; i < 5; i++) {
                myList.add(listtwo.get(i));

            }
        });
        one.start();
        two.start();
        thre.start();
        chet.start();
//        System.out.println("Обычный");

        list.forEach((a)->System.out.println(a));
        System.out.println("____________");
        for (int i = 0; i < 10; i++) {
            System.out.println(myList.get(i));

        }
//        System.out.println("МНОЖЕСТВА");
//        Thread oneset = new Thread(()->{
//            for ( Object elem : setone) {
//                System.out.println(elem);
//            }
//        });
//        Thread twoset = new Thread(()->{
//            Iterator it = settwo.iterator();
//
//            while (it.hasNext()) {
//                System.out.println(it.next());
//            }
//        });
//        Thread oneoneset = new Thread(()->{
//            for ( Object elem : mysetone) {
//                System.out.println(elem);
//            }
//        });
//        Thread twotwoset = new Thread(()->{
//            Iterator it = mysettwo.iterator();
//
//            while (it.hasNext()) {
//                System.out.println(it.next());
//            }
//        });
//        oneset.start();
//        twoset.start();
//        oneoneset.start();
//        twotwoset.start();
//
}
}
