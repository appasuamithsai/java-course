package assignments.assignment6;
import java.util.Scanner;

public class Vampire {
    public static int numDigits(int num){
        int c=0;
        while(num!=0){
            num/=10;
            c++;
        }
        return c;
    }
    public static boolean check(int x,int y,int num){
        String alpha1=x+""+y;
        String alpha2=num+"";
        int arr1[]=new int[10];
        int arr2[]=new int[10];
        for(char c:alpha1.toCharArray()){
            arr1[Character.getNumericValue(c)]++;
        }
        for(char c:alpha2.toCharArray()){
            arr2[Character.getNumericValue(c)]++;
        }
        for(int i=0;i<10;i++){
            if(arr1[i]!=arr2[i])return false;
        }
        return true;
    }

    public static boolean isSafe(int n,int num){
        if(n>=(int)Math.pow(10,(numDigits(num)/2)-1) && n<(int)Math.pow(10,numDigits(num)/2)) return true;
        return false;
    }

    public static boolean isVampire(int num){
        if(numDigits(num) %2 ==0 ){
            int x=(int)Math.pow(10,(numDigits(num)/2)-1);
            while(isSafe(x,num)){
                if(num%x==0){
                    int y=num/x;
                    if(isSafe(y,num)){
                        if(check(x,y,num)) return true;
                    }
                }
                x++;
            }

        }
        return false;
    }



    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(isVampire(num)){
            System.out.println(num+" is a vampire number.");
        }else{
            System.out.println(num+" is not a vampire number.");
        }
    }
}