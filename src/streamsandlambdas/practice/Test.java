package streamsandlambdas.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

class Empolyee{
    int eno;
    String name;
    public Empolyee(int eno,String name) {
        this.eno = eno;
        this.name = name;
    }
    public String toString(){
        return (eno+" : "+name);
    }

}

public class Test {
    public static void main(String[] args) {
        ArrayList<Empolyee> list=new ArrayList<>();
        list.add(new Empolyee(3,"Vinay"));
        list.add(new Empolyee(2,"Amith"));
        list.add(new Empolyee(4,"Nagesh"));
        list.add(new Empolyee(1,"Anil"));
        System.out.println(list);
//      Collections.sort(list,(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0);
        Collections.sort(list,(e1,e2)->e1.name.compareTo(e2.name));
        System.out.println(list);
    }
}
