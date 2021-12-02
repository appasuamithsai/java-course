package section7;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        Rectangle r2=new Rectangle(10.0,20.0);
        System.out.println(r1.preimeter());
        System.out.println();
        System.out.println(r2.preimeter());
    }
}
