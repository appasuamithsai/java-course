package sectionsix;

import java.util.Random;

public class Twice2DArray {
    private static int[][] arr;
    public static void main(String[] args) {
        arr=new int[3][3];
        fill2DArray();
        twice2DArray();
        print2DArray();
    }

    private static void print2DArray() {
        for(int row[]:arr){
            for(int i:row){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }

    private static void twice2DArray() {
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]*=2;
            }
        }
    }

    private static void fill2DArray() {
        Random r=new Random();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr[i][j]=r.nextInt(100)+1;
            }
        }
    }


}
