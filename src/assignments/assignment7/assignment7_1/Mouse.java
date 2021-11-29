package assignments.assignment7.assignment7_1;

public class Mouse extends Rodent {
    public Mouse(){
        System.out.println("In Mouse Class");
    }

    @Override
    void color() {
        System.out.println("I am black color");
    }

    @Override
    void sound() {
        System.out.println("I sounds muuu");
    }
}
