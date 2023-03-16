import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class User{
    String name;
    String email;
    String mobileNo;
    public User(String name, String email, String mobileNo) {
        this.name = name;
        this.email = email;
        this.mobileNo = mobileNo;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    public String getDetails() {
        return "User [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + "]";
    }  
}
class Teacher extends User{
    String specialization;
    List<String> assignedClasses = new ArrayList<String>();
    String subject;
    long salary;
    public Teacher(String name, String email, String mobileNo, String specialization, List<String> assignedClasses,
            String subject, long salary) {
        super(name, email, mobileNo);
        this.specialization = specialization;
        this.assignedClasses = assignedClasses;
        this.subject = subject;
        this.salary = salary;
    }
    public String getSpecialization() {
        return specialization;
    }
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public String getSubject() {
        return subject;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public void updateDetails(long salary,List<String> assignedClasses){
        this.assignedClasses=assignedClasses;
        this.salary=salary;
    } 
    public void updateDetails(String name, String email,String specialization,List<String> assignedClasses){
        this.specialization = specialization;
        this.assignedClasses = assignedClasses;
        super.setName(name);
        super.setEmail(email);
    }
    public List<String> getAssignedClasses() {
        return assignedClasses;
    }

    public void setAssignedClasses(List<String> assignedClasses) {
        this.assignedClasses = assignedClasses;
    }
    @Override
    public String getDetails(){
        return "Teacher [name=" + name + ", email=" + email + ", mobileNo=" + mobileNo + ", specialization="
                + specialization + ", subject=" + subject + ", salary=" + salary+ ", Assigned Classes=" + assignedClasses + "]";
    }

}




public class ExampleOverLoadingOverRiding01{
public static void main(String args[]){
    User user = new User("Nishu", "nishu@gmail.com", "123456789");
    System.out.println(user.getDetails());
    Teacher teacher = new Teacher("Yashika Jain", "yashika@gmail.com", "123456789", "MA", Arrays.asList(new String[]{"10A","10C","8c"}),"English", 8000);
    System.out.println(teacher.getDetails());
    teacher.updateDetails(12000, Arrays.asList(new String[] { "10A", "9C", "8c","8A" }));
    System.out.println(teacher.getDetails());
    teacher.updateDetails("Yashika", "yashika123@gmail.com", "BA", 
            Arrays.asList(new String[] {  "9A", "8C", "7A" }));
    System.out.println( teacher.getDetails());

}
}
