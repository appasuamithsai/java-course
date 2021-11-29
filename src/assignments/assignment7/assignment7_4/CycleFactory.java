package assignments.assignment7.assignment7_4;

public class CycleFactory {
    public Cycle getInstance(String str){
        if(str.equals("uni")){
            return new Unicycle();
        }else if(str.equals("bi")){
            return new Bicycle();
        }else {
            return new Tricycle();
        }
    }
}
