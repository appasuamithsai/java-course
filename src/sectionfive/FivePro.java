package sectionfive;

import java.util.ArrayList;
import java.util.Scanner;

public class FivePro {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> firstNameList=new ArrayList<>();
        ArrayList<String> lastNameList=new ArrayList<>();
        for(int i=0;i<5;i++){
            String fullName=sc.nextLine();
            firstNameList.add(fullName.substring(0,fullName.indexOf(" ")));
            lastNameList.add(fullName.substring(fullName.indexOf(" ")+1));
        }
        for(String fs:firstNameList){
            for(String ls:lastNameList){
                System.out.println(fs+" "+ls);
            }
        }
    }
}
