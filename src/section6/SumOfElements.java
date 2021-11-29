package sectionsix;

import java.util.ArrayList;

public class SumOfElements {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(sum(list));
    }

    private static int sum(ArrayList<Integer> list) {
        int sum=0;
        for(int i:list){
            sum+=i;
        }
        return sum;
    }

}
