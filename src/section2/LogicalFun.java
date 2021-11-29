package sectiontwo;

public class LogicalFun {
    public static void main(String[] args) {
       boolean isRaining =true,isWarm=false;
        System.out.println(isRaining && isWarm);
        System.out.println(isRaining || isWarm);
        System.out.println(!isRaining);
        isRaining=false;
        System.out.println(isRaining&&isWarm);
        System.out.println(isRaining||isWarm);
    }
}
