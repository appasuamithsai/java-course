package assignments.assignment7.assignment7_2;

public class Main {
    public static void main(String[] args) {
        Unicycle unicycle=new Unicycle();
        Bicycle bicycle=new Bicycle();
        Tricycle tricycle=new Tricycle();
        Cycle cycle[]=new Cycle[3];
        cycle[0]=unicycle;
        cycle[1]=bicycle;
        cycle[2]=tricycle;
        System.out.println("After up casting");
        for(int i=0;i<3;i++){
            cycle[i].balance();
        }
        System.out.println("After down casting");
        Unicycle unicycle1=(Unicycle) cycle[0];
        unicycle1.balance();
        Bicycle bicycle1=(Bicycle) cycle[1];
        bicycle1.balance();
        Tricycle tricycle1=(Tricycle) cycle[2];
        tricycle1.balance();
    }
}
