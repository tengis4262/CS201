package Assignment.Lab8;

public class Problem3 {
    public static String DNA(String word) {
        word.toUpperCase();

        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == 'A' || word.charAt(i)) {
                String a = word.toUpperCase().replace('A', 'T');
                String a1 = a.toUpperCase().replace('G', 'C');
                return a1;
            }

        }
    }


        public static void main (String[] args){
            DNA("garttcagagagagga");

        }
    }

