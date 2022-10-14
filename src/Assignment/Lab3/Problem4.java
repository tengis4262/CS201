package Assignment.Lab3;

import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {
        String name;
        double weight, calNeed;


        Scanner ob = new Scanner(System.in);
        System.out.println("What is your name ?");
        name = ob.next();
        System.out.println("What is your weight? ");
        weight = ob.nextDouble();
        calNeed = weight * 19;
        System.out.println("Hey " + name + " you need " + calNeed +  " daily");
    }
}
