// Library.java
import java.util.List;

public class Library {
    private List<LibraryItem> libraryItems;
    private List<Author> authors;
    private List<Patron> patrons;

    // Methods to add, edit, delete, search, borrow, and return library items
    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    // Methods to add, edit, delete authors
    public void addAuthor(Author author) {
        authors.add(author);
    }

    // Methods to add, edit, delete patrons
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
}
