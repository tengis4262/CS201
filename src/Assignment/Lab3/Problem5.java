package Assignment.Lab3;

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
            String name;
            int yearBorn, age;
            final int yearNow = 2022;
        System.out.println("What is your name ?");
            name = ob.next();
        System.out.println("What year you born");
            yearBorn = ob.nextInt();
            age = yearNow - yearBorn;
        System.out.println("So " + name + " you are " + age + " years old");

    }
}

