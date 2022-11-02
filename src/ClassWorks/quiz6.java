package ClassWorks;

import java.util.Scanner;

public class quiz6 {
    public static void getEmail(){
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter your first name");
        String fName = ob.next();
        System.out.println("Enter your last name");
        String lName = ob.next();
        String email = fName.charAt(0) + lName;

        System.out.println("Your MIU email is : " + "\n" + email.toLowerCase() + "@miu.edu");
    }

    public static void main(String[] args) {

        getEmail();
    }
}
