package sectionthree;

import java.util.Scanner;

public class DivisbleByThree {
    public static void main(String[] args) {
        System.out.println("Enter Any Number :: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num%3==0){
            System.out.println(num+" is Divisble By 3");
        }else{
            System.out.println(num+" is Not Divisble By 3");
        }
    }
}
