package sectionfour;

public class MoreArrayFun {
    public static void main(String[] args) {
        int arr[]=new int[10];
        for(int i=0;i<10;i++){
            arr[i]=i+1;
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
