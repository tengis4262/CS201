package ClassWorks;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter sentence");
        String word = ob.nextLine();
        //System.out.println(word);
       System.out.println(word.substring(0,word.indexOf(" ")) );


    }
}
