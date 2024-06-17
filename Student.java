// Student.java
import java.util.List;

public class Student extends Patron {
    private String studentId;
    private String major;

    public Student(String name, String address, String phoneNumber, List<LibraryItem> borrowedItems, String studentId, String major) 
    {
        super(name, address, phoneNumber, borrowedItems);
        this.studentId = studentId;
        this.major = major;
    }

    // Getters and setters

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", major='" + major + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", borrowedItems=" + borrowedItems +
                '}';
    }
}
