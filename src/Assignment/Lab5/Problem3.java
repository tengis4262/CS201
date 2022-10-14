package Assignment.Lab5;

public class Problem3 {
    private static double max;


    public static double findMax(int a , int b , int c) {
        if (a>b && a>c)
            max=a;
        else if (b>a && b>c)
            max =b;
        else
            max = c;
        return max;
    }

        public static void main(String[] args) {

        double maximum = findMax(5,6,7);
            System.out.println("Maximum is : " + maximum);
    }
}
