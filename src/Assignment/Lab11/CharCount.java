package Assignment.Lab11;

public class CharCount {
    public static int charCount(String word){

        if(word.equals(""))
            return 0;
        return 1+ charCount(word.substring(1));

        //return word.equals("")? 0:1+charCount(word.substring(1));


    }

    public static void main(String[] args) {
        System.out.println(charCount("Hello World"));
    }


}
