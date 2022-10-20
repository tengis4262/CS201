package Assignment.Lab11;

public class reverseString {
    public static String reverseString(String word, int i){
        if(i==word.length())
            return  "";
        return reverseString(word,i+1)+word.charAt(i);
//        return i==word.length() ? "" : reverseString(word,i+1)+word.charAt(i);
    }

    public static void main(String[] args) {
        System.out.println(reverseString("Java",0));
    }
}
