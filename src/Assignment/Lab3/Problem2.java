package Assignment.Lab3;
import java.util.Scanner;
public class Problem2 {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        double cm, ft, in;



        System.out.print("Enter centimeter value :");
        cm = ob.nextDouble();
        ft = cm/30.48;
        in = (ft - (int)ft)*12;
        ob.close();
        System.out.println("height in foots : " + (int)ft + " foot " + (int)in + " inches ");


    }

}
