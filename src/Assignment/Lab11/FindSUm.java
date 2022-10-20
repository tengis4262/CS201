package Assignment.Lab11;

public class FindSUm {
    public static int sum(int[] arr, int i){
        if (i==arr.length-1)
            return 0;
        return  arr[i]+ sum(arr,i+1);
    }

    public static void main(String[] args) {

        System.out.println(sum(new int[]{2,3,4,5,6,},0));
    }
}
