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

    public boolean deleteLibraryItem(String id) {
        return libraryItems.removeIf(item -> item.getId().equals(id));
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
    public boolean editAuthor(String name, String newDateOfBirth) {
        for (Author author : authors) {
            if (author.getName().equals(name)) {
                author.setDateOfBirth(newDateOfBirth);
                return true; 
            }
    }
    return false; 
}
    // Method to delete an author
    public boolean deleteAuthor(String Name) {
        return authors.removeIf(author -> author.getName().equals(Name));
    }   

    
    // Methods to add, edit, delete patrons
    public void addPatron(Patron patron) {
        patrons.add(patron);
    }
    // // Method to edit a patron
   
    public boolean editPatron( String patronNameEdit, String editPatronName, String editPatronAddress, String editPatronPhoneNumber) {
        for (Patron patron : patrons) {
            if ( patron.getName().equals(patronNameEdit)) {
                patron.setName(editPatronName);
                patron.setAddress(editPatronAddress);
                patron.setPhoneNumber(editPatronPhoneNumber);
                return true;
            }
        }
        return false; // Return false if no patron with the given name is found.
    }
    // Method to delete a patron
    public boolean deletePatron(String name) {
        return patrons.removeIf(patron -> patron.getName().equals(name));
    }

    public void printitems() {
        if(this.libraryItems == null){
            System.out.println("Library is empty");
        }
        for (LibraryItem item : libraryItems) {
            System.out.println(item);
        }
    }

    public void printPatrons() {
        if(this.patrons == null){
            System.out.println("Library is empty");
        }
        System.out.println("List Of All Patrons: ");
        for (Patron patron : patrons) {
            System.out.println("Patron Name: " + patron.getName());
            System.out.println("Patron Address: " + patron.getAddress());
            System.out.println("Patron Phone Number: " + patron.getPhoneNumber());
            System.out.println("----------------");
        }

    }

    public void printAuthors() {
        if(this.authors == null){
            System.out.println("Library is empty");
        }
        System.out.println("List Of All Authors: ");
        for (Author author : authors) {
            System.out.println("Author Name: " + author.getName());
            System.out.println("Author Address: " + author.getDateOfBirth());
            author.getWrittenItems().forEach(System.out::println);

            System.out.println("----------------");
        }

    }
// METHOD TO GET LIBRARY ITEM BY ID AND EDIT
    public LibraryItem getLibraryItemById(String itemId) {
        for (LibraryItem item : libraryItems) { 
            if (item.getId().equals(itemId)) {
                return item;
            }
}
        return null;
    }

    public void checkAuthorList(String authorName,LibraryItem libraryItem) {
        for (Author author : authors) {
            if (author.getName().equals(authorName)) {
                author.addToWrittenItems(libraryItem);

            }
        }
    }
    
    }

   


