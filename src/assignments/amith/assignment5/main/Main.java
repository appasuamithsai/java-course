package assignments.amith.assignment.main;

import assignments.amith.assignment.data.AssignmentFiveOne;
import assignments.amith.assignment.singleton.AssignmentFiveTwo;

public class Main {
    public static void main(String[] args) {
        AssignmentFiveOne obj1=new AssignmentFiveOne();
        obj1.show();
        obj1.display();
        AssignmentFiveTwo obj2=AssignmentFiveTwo.set_s("Hello");
        obj2.display(); //printing null because its  is initialized
    }
}
