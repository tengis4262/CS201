package Assignment.Lab10;

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        int n = 0;
        Scanner ob = new Scanner(System.in);


        System.out.print("Enter your array size: ");
        n = ob.nextInt();

        double[] d = new double[n];

        System.out.println("Array inputs");
        for (int i = 0; i < d.length; i++) {
            d[i] = ob.nextDouble();
        }


        System.out.print("The standard deviation is: "
                + Math.sqrt(sumOfSqrOfDeviations(d, n)));
    }

    //SUm accumulator method
    public static double calcSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double calcMean(double[] arr, int n) {
        return calcSum(arr) / n;
    }

    public static double sumOfSqrOfDeviations(double[] arr, int n) {
        double sumSqrDvtn = 0;
        double mean = calcMean(arr, n);
        for (int i = 0; i < arr.length; i++) {
            sumSqrDvtn += Math.pow((arr[i] - mean), 2);
        }
        return sumSqrDvtn / n;
    }
}
