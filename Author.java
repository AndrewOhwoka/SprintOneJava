// Author.java
import java.util.Date;
import java.util.List;

public class Author {
    private String name;
    private Date dateOfBirth;
    private List <LibraryItem>ywrittenItems;

    // Constructor

    public Author(String name, Date authorDateOfBirth, List writtenItems) {
        this.name = name;
        this.dateOfBirth = authorDateOfBirth;
        this.writtenItems = authorListOfitems;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getWrittenItems() {
        return writtenItems;
    }

    public void setWrittenItems(String writtenItems) {
        this.writtenItems = writtenItems;
    }

    public String getListOfItems() {
        return this.writtenItems.toString();
    }
}