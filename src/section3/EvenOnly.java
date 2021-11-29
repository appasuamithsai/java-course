package sectionthree;

public class EvenOnly {
    public static void main(String[] args) {
        int counter=0;
        while(counter<=10){
            if(counter%2!=0){
                counter++;
                continue;
            }
            System.out.println(counter);
            counter++;
        }
    }
}
