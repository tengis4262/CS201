package Assignment.Lab10;

import java.util.ArrayList;
import java.util.Scanner;

public class AminoAcids {
    private static Scanner ob = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter codon ");
        String n =ob.next();
        codonExtract(n);

    }

    private static void codonExtract(String s){
        s=s.toUpperCase();
        ArrayList<String> codon = new ArrayList<>();
        int n = s.length();
        n=n-(n%3);

        for (int i = 0; i < n; i+=3) {
            codon.add(s.substring(i,i+3));
        }
        for(String a : codon)
            System.out.println(a);

    }
}
