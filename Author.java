// Author.java
import java.util.Date;
import java.util.List;

public class Author {
    private String name;
    private Date dateOfBirth;
    private List<LibraryItem> writtenItems;

    // Constructor

    public Author(String name, Date dateOfBirth, List<LibraryItem> writtenItems) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = writtenItems;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public List<LibraryItem> getWrittenItems() {
        return writtenItems;
    }

    public void setWrittenItems(List<LibraryItem> writtenItems) {
        this.writtenItems = writtenItems;
    }
}
