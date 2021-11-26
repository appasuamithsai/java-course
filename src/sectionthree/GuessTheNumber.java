package sectionthree;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random rand=new Random();
        Scanner sc=new Scanner(System.in);
        int randNum=rand.nextInt(100)+1;
        int guess_count=0;
        int n=-1;
        while(n!=randNum){
            System.out.println("Enter Any Number");
            guess_count++;
            n=sc.nextInt();
            if(n<0 || n>100){
                System.out.println(" Guess wasted");
            }else if(n>randNum){
                System.out.println("Your Guess was too High");
            }else if(n<randNum){
                System.out.println("Your Guess was too Low");
            }
        }
        System.out.println("Congrats You have Guessed it Right in "+ guess_count+" number of Guesses !!!");
    }
}
