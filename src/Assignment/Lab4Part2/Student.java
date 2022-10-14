package Assignment.Lab4Part2;

public class Student {
    private String fullName,id;
    private static double GPA;
    private String Major;
    private boolean Status;
    private StuAddress address;

    public Student(String fullName, String id, double GPA,String Major, boolean active, StuAddress address){
        this.fullName = fullName;
        this.GPA = GPA;
        this.address = address;
        this.Major = Major;
        this.Status = active;
        this.id = id;

    }
    public double printFormat100(){
        double score = (GPA/4)*100;
        return score;
    }
    public void printStudentInfo(){
        System.out.println("Student full name : " + fullName +"\nStudent id : " + id + "\nMajor : " + Major + "\nGPA is : " + GPA);
    }

    public void newAdmission(String Major){
        this.Major = Major;
        GPA = 0;
    }

    public String getfName() {
        return fullName;
    }

    public void setfName(String fName) {
        this.fullName = fName;
    }



    public Double getGPA() {
        return GPA;
    }

    public void setGPA(Double GPA) {
        this.GPA = GPA;
    }

    public String getMajor() {
        return Major;
    }

    public void setMajor(String major) {
        Major = major;
    }

    public boolean isStatus() {
        if (GPA>=2.5)
            Status = true;
        else
            Status =false;
            return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public StuAddress getAddress() {
        return address;
    }

    public void setAddress(StuAddress address) {
        this.address = address;
    }
    //@Override
}
