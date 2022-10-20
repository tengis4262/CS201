package Assignment.Lab10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class fortuneTeller {
    private static Random ran = new Random();
    private static ArrayList<String> fortunes = new ArrayList<>();

    public static void fortuneTeller(){

        int i = ran.nextInt(fortunes.size());
        System.out.println(fortunes.get(i));
    }

    private static void generateFortunes() {
        fortunes.add("You will ace your next exam");
        fortunes.add("A beautiful, smart, and loving person will be coming into your life.");
        fortunes.add("A dubious friend may be an enemy in camouflage.");
        fortunes.add("A faithful friend is a strong defense.");
        fortunes.add("A feather in the hand is better than a bird in the air");
        fortunes.add("A fresh start will put you on your way.");
        fortunes.add("A friend asks only for your time not your money.");
        fortunes.add("A friend is a present you give yourself.");
        fortunes.add("A gambler not only will lose what he has, but also will lose what he doesn’t have.");
        fortunes.add("A good friendship is often more important than a passionate romance");


    }

    public static void main(String[] args) {
        generateFortunes();
        System.out.println("Want to know your fortune\nY/N?");
        Scanner ob = new Scanner(System.in);
        String ans ="";
        while(!ans.equalsIgnoreCase("n")) {
                      ans = ob.next();
            if (ans.equalsIgnoreCase("y"))
                fortuneTeller();
            System.out.println("Continue?\nY/N?");
        }

    }
}
