package Lab1;

import java.util.function.Predicate;

public class Start{
    public static void main(String[] args) {
        Predicate<Integer> pred=(b)->{

            while (b%2==0 && b!=1 && b!=0){
                b=b/2;
            }
            if (b==1 )
                return true;
            else
                return false;
        };
        System.out.println(pred.test(32));
        System.out.println(pred.test(10));
        System.out.println(pred.test(0));
        System.out.println(pred.test(1));
        System.out.println(pred.test(128));
    }
}
