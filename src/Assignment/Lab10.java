//package Assignment;
//
//import java.util.Random;
//
//public class Lab10 {
//    private static int day, month;
//    static Random ran = new Random();
//    private static double[] d;
//
//    public void setDay(int month, int day) {
//        this.day = day;
//        if (this.month>=1 && this.month<=12)
//            this.month = month;
//        else if (this.day>=1 && this.day<=31)
//            this.day = day;
//        else
//            System.out.println("Wrong date");
//    }
//    public static void SetTemperature(double[] d){
//        for (double temp:d){
//            temp =-100 +  ran.nextDouble(101);
//
//
//        }
//    }
//    public static double hottestTemp(double[] d){
//            int hotIndex = 0;
//        for (int i = 0; i <d.length; i++) {
//            if(d[i]>d[hotIndex]);
//            hotIndex = i;
//
//        }
//        return d[hotIndex];
//    }
//    public static double coldestTemp(double[] d){
//        int coldIndex = 0 ;
//        for (int i = 0; i < d.length; i++) {
//            if(d[i]<d[coldIndex]);
//            coldIndex=i;
//
//        }
//        return d[coldIndex];
//
//    }
//    public static double averageTempMonth(double[] month){
//        double sum = 0;
//        for (int i = 0; i < month.length; i++) {
//            sum+=month[i];
//
//        }
//        return (sum/month.length);
//    }
//    public static void differenceMonth(double[] month){
//        double dif;
//        int maxIndex=0, minIndex=0;
//        for (int i = 0; i < month.length; i++) {
//            if(d[i]>d[maxIndex]) {
//                maxIndex = i;
//                double max = d[i];
//            }else if
//            (d[i]<d[minIndex]) {
//                minIndex = i;
//                double min = d[i];
//
//
//            }
//            System.out.println("Difference between cold and hot : is " + (max-min));
//        }
//
//    }
//
//
//
//    public static void main(String[] args) {
//        double [] dT = new double[365];
//        Random ran = new Random();
//        Lab10 temp = new Lab10();
//        temp.setDay(12,30);
//        SetTemperature(new double[365]);
//        hottestTemp(new double[365]);
//
//    }
//}
