package section8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class CircleFile {
    public static void main(String[] args) {
        Scanner sc;
        ArrayList<Circle> list=new ArrayList<>();
        try{
            PrintWriter printWriter=new PrintWriter("circle_output.txt");
            sc=new Scanner(new File("/home/amitsa/IdeaProjects/JavaCourse/src/section8/circle_data"));
            while (sc.hasNext())list.add(new Circle(sc.nextInt()));
            for(Circle i:list){
                printWriter.println(i.circumference());
                printWriter.println(i.area());
            }
            sc.close();
            printWriter.close();
        }catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
