package Assignment.Lab10;

import java.util.Random;

public class Problem1 {
    static Random ran = new Random();
    static double[] days = new double[365];

    private static void generateTemps() {
        for (int i = 0; i < days.length; i++) {
            days[i] = -30 + ran.nextDouble(71);
        }
    }

    public static double hottestDay(){
        int max = 0;
        for (int i = 0; i < days.length; i++) {
            if(days[i] > days[max])
                max = i;
        }
        return days[max];

    }
    public static double coldestDay(){
        int min = 0;
        for (int i = 0; i < days.length; i++) {
            if(days[i] < days[min])
                min = i;
        }

        return days[min];
    }
    public static double averageTemp(double[] days){
        double sum = 0;
        for (int i = 0; i < days.length; i++) {
            sum += days[i];
        }
        return sum / days.length;
    }
    public static double difHotnCold() {
        double max = hottestDay();
        double min = coldestDay();

        return max - min;
    }
    public static void tempAnyDay(int month, int day){

        if(1 <= month && month <= 12 && 1 <= day && day<=31)
            System.out.println("The temperature of  " + month + "." + day +".22 is : " + days[month * day]);
        else
            System.out.println("Wrong input");
    }

    public static void main(String[] args) {
        //generate temps for everyday
        generateTemps();

        tempAnyDay(12,23);
        tempAnyDay(1,23);
        tempAnyDay(2,23);
        tempAnyDay(5,23);
        tempAnyDay(13,23);
        System.out.println(hottestDay());
        System.out.println(coldestDay());
    }

}
