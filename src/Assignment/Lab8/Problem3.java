package Assignment.Lab8;
import java.util.Scanner;
public class Problem3 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("Input some data");
        String input = ob.next().toUpperCase();
        String dna = dnaCheck(input);
        System.out.println(dna);
       // System.out.println(dnaCheck("gtacacahget"));

    }


    public static String dnaCheck(String a) {

        a.toUpperCase();
        String a1 = "";
        String b2 = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c == 'G' || c == 'A') {
                 a1 = a.toUpperCase().replace('A', 'T');
                 b2 = a1.toUpperCase().replace('G', 'C');
            }
        }
        return b2;
    }
}



