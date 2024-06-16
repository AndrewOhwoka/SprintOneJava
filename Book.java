// Book.java
public class Book extends LibraryItem {
    private boolean isPrinted;
    private boolean isElectronic;
    private boolean isAudio;

    // getters
    public boolean getIsPrinted() {
        return isPrinted;
    }

    public boolean getIsElectronic() {
        return isElectronic;
    }

    public boolean getIsAudio() {
        return isAudio;
    }

    // setters
    public void setIsPrinted(boolean isPrinted) {
        this.isPrinted = isPrinted;
    }

    public void setIsElectronic(boolean isElectronic) {
        this.isElectronic = isElectronic;
    }

    public void setIsAudio(boolean isAudio) {
        this.isAudio = isAudio;
    }
}