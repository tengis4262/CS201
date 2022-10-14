package ClassWorks;
import  ClassWorks.Wage;
public class Employee {
    private String name, id;
    private Wage salary;

    public Employee(String fname, String id,Wage salary){
    name =fname;
    this.id = id;
    this.salary = salary;

    }

    public Wage getSalary() {
        return salary;
    }

    public void setSalary(Wage salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString(){
        String res = "Employee name : " + name + "\nEmployee id : " + id + "\nAnnual Salary: " + salary.getAnnualSalary() +
         "\nSalary : " + salary.getSalary();
        return res;
    }
}
