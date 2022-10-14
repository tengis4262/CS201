package Assignment.Lab7;

import java.util.Scanner;

public class Problem4 {
    private static int n;
    static Scanner ob = new Scanner(System.in);
    private static boolean b = false;


    public static boolean isPrime1(int n) {
        boolean status=true;
        if(n==1 || n==0)
            status=false;
        for(int i=2; i<n;i++) {
            if(n%i==0)
                status= false;
        }
        return status;
    }

        public static void main (String[] args) {

            Scanner ob = new Scanner(System.in);

            System.out.println("Enter number\nEnter negative number to stop the programm");

            while (!(n<0)) {
                int n = ob.nextInt();
                if (isPrime1(n)) {
                    System.out.println("Number : " + n + " is prime");
                } else
                    System.out.println("Number : " + n + " is not prime");
                }


        }
}
