package assignments.amith.assignment.singleton;

public class AssignmentFiveTwo {
    private static  AssignmentFiveTwo obj;
    private String s;
    public static AssignmentFiveTwo  set_s(String s){
//        this.s=s;     //acessing non static memebsrs in static function is not possible
        obj=new AssignmentFiveTwo();
        return obj;
    }
    public void display(){
        System.out.println(s);
    }


}
