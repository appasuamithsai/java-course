package sectionthree;

import java.util.Scanner;

public class Fraternity {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char gender=sc.next().charAt(0);
        int age=sc.nextInt();
        if(gender=='M' && age>=19 ){
            System.out.println("Eligible for Fraternity");
        }else{
            System.out.println("Not Eligible for Fraternity");
        }
    }
}
