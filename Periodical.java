// Periodical.java
public class Periodical extends LibraryItem {
    private boolean isPrinted;
    private boolean isElectronic;

    // Constructor
    public Periodical(String id, String title, String author, String isbn, String publisher, int numberOfCopies, Status status, boolean isPrinted, boolean isElectronic) {
        super(id, title, author, isbn, publisher, numberOfCopies, status);
        this.isPrinted = isPrinted;
        this.isElectronic = isElectronic;
    }

    // Getters and setters
    public boolean isPrinted() {
        return isPrinted;
    }

    public void setPrinted(boolean isPrinted) {
        this.isPrinted = isPrinted;
    }

    public boolean isElectronic() {
        return isElectronic;
    }

    public void setElectronic(boolean isElectronic) {
        this.isElectronic = isElectronic;
    }
}