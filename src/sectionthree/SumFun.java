package sectionthree;

import java.util.Scanner;

public class SumFun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        while(num>=0){
            sum+=num;
            num=sc.nextInt();
        }
        System.out.println("Sum ::"+sum);
        System.out.println("Done!!!");
    }
}
