package ClassWorks;

public class numberFormat {
    public static void numFormat(long number){
        String a = String.valueOf(number);
        if (a.length()==10)
            System.out.println(a.substring(0,3)+"-"+a.substring(3,6)+ "-" + a.substring(6));
        else
            System.out.println("Wrong number");
    }

    public static void main(String[] args) {
       numFormat(2247959991l);
    }
}
