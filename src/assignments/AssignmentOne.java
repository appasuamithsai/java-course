package assignments;

import java.util.*;
import java.util.regex.*;
import java.io.File;
public  class AssignmentOne{
    public static boolean check(String regex,File file){
    Pattern pattern;
        try{
        	pattern=Pattern.compile(regex);
        }
        catch(Exception e){
        		System.out.println(e.getMessage());
			return false;
	    }
       Matcher matcher;
       boolean flag=false;
        for(File f:file.listFiles()){
            matcher = pattern.matcher(f.getName());
            if(matcher.find()){
            	System.out.println("File found and its path is :" + f.getAbsolutePath());
            	flag=true;
            }
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Regular Exp  :: ");
        File file=new File("/home/amitsa/Desktop");
        while(true){
        	String regex=sc.nextLine();
        	if(check(regex,file)){
            		System.out.println("Hurray Found The Files !!!!");
            		break;
        	}
        }
    }
}
