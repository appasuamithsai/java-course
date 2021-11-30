package assignments.assignment8;

public class Main {
    public static void main(String[] args) {
        ExceptionClass exceptionClass=new ExceptionClass();
        try {
            String s=null;
            exceptionClass.m1(1);
            exceptionClass.m1(2);
            exceptionClass.m1(3);
            System.out.println(s.length());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("In Finally");
        }
    }
}
