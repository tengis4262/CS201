package Assignment.Lab8;

import java.util.Scanner;

class Problem4 {
    public static boolean isPalindrome(String str)
    {
        String rev = "";
        boolean ans = false;

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }
    public static void main(String[] args){
        String str;
        Scanner ob =new Scanner(System.in);
        System.out.println("Enter any word\nTo check if its palindrome\nEnter 'exit' to quit the programm");
            str = ob.next();
            str = str.toLowerCase();

    while (!str.equals("exit")){
            boolean A = isPalindrome(str);
            System.out.println(A);
        System.out.println("Enter another word");
        str = ob.next();
        }



    }
}
