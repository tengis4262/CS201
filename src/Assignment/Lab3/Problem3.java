package Assignment.Lab3;

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Double celc, far;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter Celcius i'll convert to farenheit");
        celc = ob.nextDouble();
        far = 32 + (celc *(9/5));
        System.out.println("Coverting " + celc + " to Farenheit :" + far);
    }

}
