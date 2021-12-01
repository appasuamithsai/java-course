package streamsandlambdas.practice;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalProgramming {
//    public static  int square(int n){
//        return n*n;
//    }

    public static void main(String[] args) {
//        System.out.printf(""+square(10));
        Function<Integer,Integer> f=i->i*i;
        System.out.println(f.apply(10)+"");
        //checking number is even or odd
        Predicate<Integer> p=i->i%2==0;
        System.out.printf(p.test(20)+"");
    }
}
