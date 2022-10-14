package Assignment.Lab4;

public class Problem1 {
    private double earthWeight;
    public double Moonweight(double earthWeight){
        this.earthWeight = earthWeight;
        Double moonWeight = (earthWeight/9.81)*1.622;
        System.out.println("Your moon weight is : " + moonWeight);
            return moonWeight;
    }


    public static void main(String[] args) {
        Problem1 cal = new Problem1();
        cal.Moonweight(160);


    }

}
