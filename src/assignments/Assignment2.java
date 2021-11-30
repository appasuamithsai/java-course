package assignments;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment2 {
    public static boolean check(String s){
        int arr[]=new int[26];
        for(char c:s.toCharArray()){
            arr[c-'a']++;
        }
        System.out.println(Arrays.toString(arr));
        for(int i:arr){
            if(i==0)return false;
        }
        return true;
    }

    //    public static boolean check(String s){
//       for(int i=0;i<26;i++){
//            if(!s.contains((char)('a'+i) + "")) return false;
//      }
//       return  true;
//    }
    /*
    where N is the Length of String
    Time Complexity - O(N)
    Space Complexity - O(1)
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine().toLowerCase();
        System.out.println(check(s));
    }
}
