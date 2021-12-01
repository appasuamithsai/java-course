package assignments.assignment11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment11 {
    static HashMap<Character,Integer> map;
    public static void main(String[] args)  {
        File file=new File(args[0]);
        Scanner sc=null;
        map=new HashMap<>();
        try {
            sc = new Scanner(file);
            while(sc.hasNext()){
                updateMap(sc.next());
            }
        }
        catch (FileNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println(map);
            sc.close();
        }
    }

    private static void updateMap(String s) {
        for(char c:s.toLowerCase().toCharArray()){
            if(c>='a' && c<='z'){
                if(map.containsKey(c)){
                    map.replace(c,map.get(c)+1);
                }else map.put(c,1);
            }
        }
    }
}
