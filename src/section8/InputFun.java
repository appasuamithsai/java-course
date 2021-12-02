package section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputFun {

    public static void main(String[] args) {
        Scanner sc;
        try{
            int sum=0;
            sc=new Scanner(new File("/home/amitsa/IdeaProjects/JavaCourse/src/section8/cool"));
            while (sc.hasNext()) sum+=sc.nextInt();
            System.out.println(sum);
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }
    }
}
