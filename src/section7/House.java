package section7;

public class House {
    private int numStroies,numWindows;
    private String color;
    public House(){}

    public House(int numStroies,int numWindwos,String color){
        this.numStroies=numStroies;
        this.color=color;
        this.numWindows=numWindwos;
    }

    public int getNumStroies() {
        return numStroies;
    }

    public void setNumStroies(int numStroies) {
        this.numStroies = numStroies;
    }

    public int getNumWindows() {
        return numWindows;
    }

    public void setNumWindows(int numWindows) {
        this.numWindows = numWindows;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
