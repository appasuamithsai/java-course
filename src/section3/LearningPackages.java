package sectionthree;

import java.util.Scanner;

public class LearningPackages {
    public static void main(String[] args) {
        System.out.println("Enter the Package and the number of courses you want to Enroll :: ");
        Scanner sc=new Scanner(System.in);
        int pack=sc.nextInt();
        int courseNo=sc.nextInt();
        switch (pack){
            case 1: courseNo-=2;
                System.out.println(courseNo*6);
                break;
            case 2:courseNo-=4;
                System.out.println(courseNo*4);
                break;
            case 3:courseNo-=6;
                System.out.println(courseNo*3);
                break;
        }
    }
}
