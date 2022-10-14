package ClassWorks;

public class Wage {
    private double salary;
    private double annualSalary;

    public Wage(double salary,double annualSalary){
        this.salary = salary;
        this.annualSalary=annualSalary;


    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
