package section8;

public class Circle {
    private double radius;
    public Circle(){
        radius=0.0;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double area(){
        return Math.PI*radius*radius;
    }
    public double circumference(){
        return  2*Math.PI*radius;
    }

}
