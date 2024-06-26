
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
   // Method to edit an author
    public void editAuthor(String Name, Author newAuthor) {
        for (Author author : authors) {
            if (author.getName().equals(Name)) {
                author.setName(newAuthor.getName());
                author.setDateOfBirth(newAuthor.getDateOfBirth());
                author.setWrittenItems(newAuthor.getWrittenItems());
                break;
            }
        }
    }
    // Method to delete an author
    public void deleteAuthor(String Name) {
        authors.removeIf(author -> author.getName().equals(Name));
    }   

    
    // Methods to add, edit, delete patrons
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    // Method to edit a patron
    public void editPatron(String name, Patron newPatron) {
        for (Patron patron : patrons) {
            if (patron.getName().equals(name)) {
                patron.setName(newPatron.getName());
                patron.setAddress(newPatron.getAddress());
                patron.setPhoneNumber(newPatron.getPhoneNumber());
                patron.setBorrowedItems(newPatron.getBorrowedItems());
                break;
            }
        }
    }
    // Method to delete a patron
    public void deletePatron(String name) {
        patrons.removeIf(patron -> patron.getName().equals(name));
    }

    public void printitems() {
        for (LibraryItem item : libraryItems) {
            System.out.println(item);
        }
    }
}