package Assignment.Lab5;

import java.util.Random;

public class Problem4 {
    private int rollNumber;
    static Random ran = new Random();


    private static void rollDice(){
        int a = ran.nextInt(6)+1;
        if (a>=3)
            System.out.println("Your roll is : " + a + "\nYou are lucky");
        else
            System.out.println("Your roll is : " + a + "\nTry again");
    }

    public static void main(String[] args) {
        rollDice();
    }
}
