// Periodical.java
public class Periodical extends LibraryItem {
    private boolean isPrinted;
    private boolean isElectronic;

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