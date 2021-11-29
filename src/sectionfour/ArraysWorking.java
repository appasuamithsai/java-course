package sectionfour;

import java.util.Scanner;

public class ArraysWorking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter integer :: ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("Result :: "+arr[i]*2);
        }
    }
}
