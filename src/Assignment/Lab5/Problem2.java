package Assignment.Lab5;

public class Problem2 {
    private  double commision;
    private  double sales;
    private double oT;
    private int hours;
    private final double hWage = 7.25;
    public Problem2(int Hours, double sales){
        hours = Hours;
        this.sales = sales;

    }
    public double overTimeWage(){
        if (hours>40)
            oT = (hours - 40)*(7.25*1.5);
        return oT;
    }
    public double hourlyWage(){
        double d = 40*7.25;
        return d;
    }
    public double wageWithoutCom(){
        double c = overTimeWage()+hourlyWage();
        return c;
    }

    public double comWage (){
        if (sales>=1 && sales<=99.99)
            commision = 0.05;
        else if (sales>=100 && sales<=299.99)
            commision = 0.1;
        else
            commision = 0.15;
        double wage = commision * wageWithoutCom();
        return wage;
    }
    public double wage(){
        double d = comWage()+wageWithoutCom();
        return d;
    }
    @Override
    public String toString(){
        String print = "Total wage with commision and with overtime for " + hours + " hours of work\nAnd $" + sales + "  sales is : $" + wage();
        return print;
    }

    public static void main(String[] args) {
        Problem2 wage = new Problem2(45,100);
        System.out.println(wage.toString());

    }
}
