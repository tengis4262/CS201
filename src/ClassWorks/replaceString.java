package ClassWorks;

public class replaceString {
    public static String replaceAll(String word, char find, char replace){
        for (int i = 0; i < word.length(); i++)
            i = find;
            String rep = word.replace(find,replace);
            return rep;

    }

    public static void main(String[] args) {
        System.out.println(replaceAll("Madara", 'r', 'o'));
    }
}
