package sectiontwo;

import java.util.Scanner;

public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers :: ");
        double n1=sc.nextDouble();
        double n2=sc.nextDouble();
        double n3=sc.nextDouble();
        System.out.println("Average :: "+(n1+n2+n3)/3);
    }
}
