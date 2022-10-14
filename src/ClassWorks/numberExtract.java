package ClassWorks;
import java.util.regex.*;
public class numberExtract {

    public static  void numberExtract(String pNumber){
        StringBuffer pureNumber = new StringBuffer("");

        for (int i = 0; i < pNumber.length(); i++) {
            String a = String.valueOf(pNumber.charAt(i));
            if(a.matches("[0-9]"))
                pureNumber.append(a);
        }
        if (pureNumber.length()==10)
            System.out.println("Valid : (" + pureNumber.substring(0,3) + ")-" + pureNumber.substring(3,6)+ "-" + pureNumber.substring(6));
        else
            System.out.println("Wrong number");
    }

    public static void main(String[] args) {
        numberExtract("2247959991");

    }

}
