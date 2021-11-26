package sectionthree;

import java.util.Random;

public class DiceSimulation {
    public static void main(String[] args) {
        Random rand=new Random();
        for(int i=0;i<10;i++){
            System.out.println(rand.nextInt(6)+1);
        }
    }
}
