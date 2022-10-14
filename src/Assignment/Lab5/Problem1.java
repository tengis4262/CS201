package Assignment.Lab5;

import java.util.Scanner;

import static java.lang.Math.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        long a ,b;
        double d;
        System.out.println("Enter power of ten\nEnter 0 to stop the code");

        do {
            a = ob.nextLong();
            if (a >=100)
                System.out.println("Googol");
            else if (a >=30)
                System.out.println("Nonillion");
            else if (a >= 21)
                System.out.println("Sextillion");
            else if (a >= 18)
                System.out.println("Quintillion");
            else if (a >= 15)
                System.out.println("Quadrillion");
            else if (a >= 12)
                System.out.println("Trillion");
            else if (a >= 9)
                System.out.println("Billion");
            else if (a >= 6)
                System.out.println("Million");
            else if (a >= 3)
                System.out.println("Thousands");
            else
                System.out.println("Hundred");

        }while (a != 0);
    }

}
