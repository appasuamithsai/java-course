package section7;

public class CircleDemo {
    public static void main(String[] args) {
        Circle c1=new Circle(10);
        System.out.println(String.format("%.2f",c1.area()));
        System.out.println(String.format("%.2f",c1.circumference()));
    }
}
