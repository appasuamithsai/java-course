package streamsandlambdas.practice;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPracticeOne {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(35);
        list.add(37);
        list.add(33);
        System.out.println(list);
        System.out.println(list.stream().filter(i->i%2==0).collect(Collectors.toList()));
        System.out.println(list.stream().map(i->i*2).collect(Collectors.toList()));
        System.out.println(list.stream().filter(i->i%2==0).count());
        System.out.println(list.stream().sorted().collect(Collectors.toList()));
        System.out.println(list.stream().min((i1,i2)->i1.compareTo(i2)).get());
        System.out.println(list.stream().max((i1,i2)->i1.compareTo(i2)).get());
        list.stream().forEach(System.out::println);
        Integer[] i=list.stream().toArray(Integer[]::new);
        Stream.of(i).forEach(System.out::print);
    }
}
