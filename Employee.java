// Employee.java
import java.util.List;

public class Employee extends Patron {
    private String employeeId;
    private String department;

    public Employee(String name, String address, String phoneNumber, List<LibraryItem> borrowedItems, String employeeId, String department) {
        super(name, address, phoneNumber, borrowedItems);
        this.employeeId = employeeId;
        this.department = department;
    }

    // Getters and setters
    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId='" + employeeId + '\'' +
                ", department='" + department + '\'' +
                ", name='" + this.getName() + '\'' +
                ", address='" + this.getAddress() + '\'' +
                ", phoneNumber='" + this.getPhoneNumber() + '\'' +
                ", borrowedItems=" + this.getBorrowedItems() +
                '}';
    }
}