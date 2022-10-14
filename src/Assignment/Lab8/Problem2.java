package Assignment.Lab8;

public class Problem2 {
    private static int count =0;
    public static int isUppercase(String sentence){
        StringBuffer sb = new StringBuffer(sentence);
        for (int i = 0; i < sentence.length(); i++) {
          if (sentence.charAt(i)>='A'&& sentence.charAt(i)<='Z')
              count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(isUppercase("My Dad is My Hero@jhvhjgGYHHH"));
    }
}
