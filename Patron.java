// Patron.java
import java.util.List;

public abstract class Patron {
    protected String name;
    protected String address;
    protected String phoneNumber;
    protected List<LibraryItem> borrowedItems;

    public Patron(String name, String address, String phoneNumber, List<LibraryItem> borrowedItems) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.borrowedItems = borrowedItems;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<LibraryItem> getBorrowedItems() {
        return borrowedItems;
    }

    public void setBorrowedItems(List<LibraryItem> borrowedItems) {
        this.borrowedItems = borrowedItems;
    }
}