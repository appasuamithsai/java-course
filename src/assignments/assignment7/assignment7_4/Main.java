package assignments.assignment7.assignment7_4;

public class Main {
    public static void main(String[] args) {
        CycleFactory  cycleFactory=new CycleFactory();
        Cycle cycle=cycleFactory.getInstance("uni");
        cycle.balance();
    }
}
