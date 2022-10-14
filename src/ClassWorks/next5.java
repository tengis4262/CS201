package ClassWorks;

import java.util.Scanner;

public class next5 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter number");
        int n = ob.nextInt();
        for(int i=n; i<=n+9; i++)
            System.out.print(" " + i);
    }

}
