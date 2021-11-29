package sectionfour;

import java.util.ArrayList;

public class ArrayListFun {
    public static void main(String[] args) {
        ArrayList<String> namesList=new ArrayList<>();
        namesList.add("Amith");
        namesList.add("Ajith");
        namesList.add("MCS");
        namesList.add("Cool");
        for(String s:namesList){
            System.out.println(s);
        }
    }
}

