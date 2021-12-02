package section7;

public class HouseDemo {

    public static void printHouseData(House house){
        System.out.println(" House is "+house.getColor()+" Color . and "+house.getNumStroies()+" stores and "+house.getNumWindows()+" windows.");
    }


    public static void main(String[] args) {
        House myHouse=new House(2,10,"Blue");
        House yourHouse=new House();
        yourHouse.setColor("Red");
        yourHouse.setNumStroies(3);
        yourHouse.setNumWindows(15);

        printHouseData(myHouse);
        System.out.println();
        printHouseData(yourHouse);

    }
}
