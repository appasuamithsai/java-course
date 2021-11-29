package sectionfive;

import java.util.Scanner;

public class NameParser {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fullName=sc.nextLine();
        System.out.println("First Name :: "+fullName.split(" ")[0].toLowerCase());
        System.out.println("Last Name :: "+fullName.split(" ")[1].toUpperCase());
    }
}
