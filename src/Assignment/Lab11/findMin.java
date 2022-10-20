package Assignment.Lab11;

public class findMin {
    public static int findMin(int[] a, int idx) {

        if (a.length - 1 == idx)
            return a[idx];
        System.out.println(idx + " " + a[idx]);

        int nextMin = findMin(a, idx + 1);

        if (a[idx] < nextMin)
            return a[idx];
        return nextMin;
        //return a[idx] < nextMin ? a[idx] : nextMin;
    }


    public static void main(String[] args) {
        //System.out.println(fraction(5));
        int[] a = new int[]{10,4,7,12,6};

        System.out.println(findMin(a, 0));
    }
}
