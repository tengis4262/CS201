package ClassWorks;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Tengis", "E6358383",new Wage(1234.56,123124.54));
        Employee emp2 = new Employee("Ambisa","A134314123",new Wage(1234.56,123421.3214));




        System.out.println(emp1);
        System.out.println("");
        System.out.println(emp2.toString());

    }
}
