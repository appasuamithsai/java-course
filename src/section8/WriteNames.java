package section8;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class WriteNames {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
        names.add("Hello");
        names.add("Welcome");
        names.add("To");
        names.add("Java");
        names.add("World");
        try {
            PrintWriter printWriter=new PrintWriter("names.txt");
            for(String s:names){
                printWriter.println(s);
            }
            printWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
