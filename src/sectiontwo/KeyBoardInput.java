package sectiontwo;

import java.util.Scanner;

public class KeyBoardInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any real Number :: ");
        double n=sc.nextInt();
        System.out.println("Enter Your Name ::");
        String name=sc.next();
        System.out.println("Enter your Age :: ");
        int age=sc.nextInt();
        sc.nextLine();
        n*=2;
        System.out.println("product :: "+n);
        System.out.println("Enter Your City");
        String city=sc.next();

        System.out.println("Your Name :: "+name);

        System.out.println("Your age :: "+age);

        System.out.println("Your city :: "+city);

    }
}
