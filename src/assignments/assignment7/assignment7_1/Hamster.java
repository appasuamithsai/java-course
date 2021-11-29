package assignments.assignment7.assignment7_1;

public class Hamster extends Rodent {
    public Hamster(){
        System.out.println("In Hamster Class");
    }

    @Override
    void color() {
        System.out.println("I am white in color");
    }

    @Override
    void sound() {
        System.out.println("I sounds huuuu");
    }
}
