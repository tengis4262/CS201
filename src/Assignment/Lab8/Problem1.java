package Assignment.Lab8;

public class Problem1 {
    private static int counta = 0,counte = 0,counti = 0,counto = 0,countu = 0;
    public static void vowelCount(String sentence) {
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'A') {
                counta++;
            }
            if (sentence.charAt(i) == 'e' || sentence.charAt(i) == 'E') {
                counte++;
            }
            if (sentence.charAt(i) == 'i' || sentence.charAt(i) == 'I') {
                counti++;
            }
            if (sentence.charAt(i) == 'o' || sentence.charAt(i) == 'O') {
                counto++;
            }
            if (sentence.charAt(i) == 'u' || sentence.charAt(i) == 'U') {
                countu++;
            }
        }
        System.out.println("# of 'a' :" + counta);
        System.out.println("# of 'e' :" + counte);
        System.out.println("# of 'i' :" + counti);
        System.out.println("# of 'o' :" + counto);
        System.out.println("# of 'u' :" + countu);
    }

    public static void main(String[] args) {
        vowelCount("I love programming and i love using IntelliJ as my IDE");
    }
}
