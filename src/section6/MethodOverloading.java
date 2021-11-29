package sectionsix;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(getResult(10,20));
        System.out.println(getResult("amith","sai"));
    }
    public static int getResult(int num1,int num2){return  num1+num2;}
    public static String getResult(String fs,String ls){return  fs+" "+ls;}

}
