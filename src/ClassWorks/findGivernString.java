package ClassWorks;

public class findGivernString {
    public static boolean beginWith(String Word, String begins){
        for (int i = 0; i < begins.length(); i++) {
            if(begins.charAt(i)!=Word.charAt(i))
                return false;

        }
        return true;


    }

    public static void main(String[] args) {
        System.out.println(beginWith("Madara", "Mado"));
    }
}
