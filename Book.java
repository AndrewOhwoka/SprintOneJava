// Book.java
public class Book extends LibraryItem {
    private boolean isPrinted;
    private boolean isElectronic;
    private boolean isAudio;

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

    public boolean isAudio() {
        return isAudio;
    }

    public void setAudio(boolean isAudio) {
        this.isAudio = isAudio;
    }
}