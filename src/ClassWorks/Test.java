package ClassWorks;

public class Test {
    public static void doubleInput(int x, double y){
        x=2*x;
        y=2*y;
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {

        int x = 5;
        int y = 6;
        Test.doubleInput(x,y);
        System.out.println(x);
        System.out.println(y);
    }
}
