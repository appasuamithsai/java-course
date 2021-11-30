package assignments;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String input=scanner.nextLine();
        Pattern pattern=Pattern.compile("[A-Z]+[A-Za-z]*(.)$");
        Matcher matcher=pattern.matcher(input);
        if(matcher.find()){
            System.out.println("It is a Sentence");
        }else{
            System.out.println("It is not a Sentence");
        }
    }
}
