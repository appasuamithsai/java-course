package sectiontwo;

import java.util.Scanner;

public class MatLibsClone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Adj1 : ");
        String adj1=sc.nextLine();
        System.out.println("Enter Grl_name : ");
        String grlName=sc.nextLine();
        System.out.println("Enter Adj2 : ");
        String adj2=sc.nextLine();
        System.out.println("Enter OCC1 : ");
        String occ1=sc.nextLine();
        System.out.println("Enter place : ");
        String place=sc.nextLine();
        System.out.println("Enter clothing : ");
        String clothing=sc.nextLine();
        System.out.println("Enter hobby : ");
        String hobby=sc.nextLine();
        System.out.println("Enter Adj3 : ");
        String adj3=sc.nextLine();
        System.out.println("Enter OCC2 : ");
        String occ2=sc.nextLine();
        System.out.println("Enter boyName : ");
        String boyName=sc.nextLine();
        System.out.println("Enter manName : ");
        String manName=sc.nextLine();

        System.out.println("There once was a "+adj1+"girl named"+grlName+", who was a "+adj2+" "+occ1+"in the kingdom" +
                "of "+place+" ."+" She loved to wear "+clothing+"and to "+hobby+"."+"She wnated to marry the "+adj3+occ2+"Named"
                +boyName+"but her father king "+manName+"forbid from seeing him.");
    }
}
