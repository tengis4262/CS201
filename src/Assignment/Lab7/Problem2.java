package Assignment.Lab7;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;
        int j = 5;
    //Task a
        for (int i = 1; i <= 100; i++)
            sum1 += i;
        System.out.println(sum1);

    /* Task a Alternative
    Scanner ob = new Scanner(System.in);
    int n = ob.nextInt();
    for(int i = 1; i<=n;i++);
        sum+=i;
        System.out.println(sum);
     */

    //Task b
        for (int i = 5; i <= 50;) {
            sum2+=i;
            i=i+5;
        }
        System.out.println(sum2);
    }

}

