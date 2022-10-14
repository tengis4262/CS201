package Assignment.Lab4Part2;

public class StudentMain {
    public static void main(String[] args) {


    Student st1 = new Student("Tengis Erdenebaatar","114070",3.9,"MSD",true,
            new StuAddress("1000 N 4th ","Fairfield","IA",52513));
    st1.isStatus();
    st1.printFormat100();
    st1.printStudentInfo();
        System.out.println(st1.printFormat100());
        System.out.println("Student Active status : " + st1.isStatus());
    st1.newAdmission("ComPro");
    st1.printStudentInfo();
            Student st2 = new Student("Nishesh Acharya","123214",1.6,"MSD",false,
            new StuAddress("1000 N 4th","Faifield","IA",12513));
    st2.printStudentInfo();
        System.out.println(st2.printFormat100());
        System.out.println("Student Active status : " + st2.isStatus());


    }
}
