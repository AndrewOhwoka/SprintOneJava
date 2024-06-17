
// Library.java
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> libraryItems;
    private List<Author> authors;
    private List<Patron> patrons;

    public Library() {
        this.libraryItems = new ArrayList<>();
        this.authors = new ArrayList<>();
        this.patrons = new ArrayList<>();
    }

    // Methods to add, edit, delete, search, borrow, and return library items
    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void editLibraryItem(String id, LibraryItem newItem) {
        for (LibraryItem item : libraryItems) {
            if (item.getId().equals(id)) {
                item.setTitle(newItem.getTitle());
                item.setAuthor(newItem.getAuthor());
                item.setIsbn(newItem.getIsbn());
                item.setPublisher(newItem.getPublisher());
                item.setNumberOfCopies(newItem.getNumberOfCopies());
                item.setStatus(newItem.getStatus());
                break;
            }
        }
    }

    public void deleteLibraryItem(String id) {
        libraryItems.removeIf(item -> item.getId().equals(id));
    }

    public void borrowLibraryItem(String title, Patron patron) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equals(title) && item.getStatus() == Status.AVAILABLE && item.getNumberOfCopies() > 0) {
                item.borrowItem(patron);
                break;
            }
        }
    }

    public void returnLibraryItem(String title, Patron patron) {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().equals(title)) {
                item.returnItem(patron);
                break;
            }
        }
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