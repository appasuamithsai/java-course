package sectionfour;

import java.util.ArrayList;
import java.util.Scanner;

public class ParllelArrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> namesList=new ArrayList<>();
        ArrayList<Integer> ageList=new ArrayList<>();
        for(int i=0;i<5;i++){
            String name=sc.nextLine();
            namesList.add(name);
            int age=sc.nextInt();
            ageList.add(age);
        }
        for(int i=0;i<5;i++){
            System.out.println(namesList.get(i)+" is "+ageList.get(i)+" age.");
        }
    }
}
