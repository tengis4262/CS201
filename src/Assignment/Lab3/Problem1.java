package Assignment.Lab3;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        int a, b ,c;
        double equation,R;
        final double pi = 3.14;
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter value to a : ");
        a= ob.nextInt();
        System.out.print("Enter value to b : ");
        b = ob.nextInt();
        System.out.print("Enter value to c : ");
        c = ob.nextInt();
        System.out.print("Enter R value : ");
        R = ob.nextDouble();
        equation = (Math.pow(b, 2)+(4*a*c));
        System.out.println("Equation of (B^2 + (4*A*C)^2 is : " + Math.pow(equation, 2));

        double equation2 = a + (4 * Math.pow(c, 3));
        System.out.println("The square root of A+4B^3 " + equation2);
        double sum = a+b;
        double equation3 = Math.pow(sum, (1/3));
        System.out.println("The cube root of product A and B " + equation3);
        double equation4 = pi * Math.pow(R, 2);
        System.out.println("The area of a circle : " + equation4);




    }

}
