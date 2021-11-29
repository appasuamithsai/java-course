package sectionfour;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProject {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        while(true){
            int num=sc.nextInt();
            if(num<0) break;
            list.add(num);
        }
        for(int i=list.size()-1;i>=0;i--){
            System.out.println(list.get(i));
        }
    }
}
