// LibraryItem.java
public class LibraryItem implements Borrowable {
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int numberOfCopies;
    private Status status;

    //constructor
    public LibraryItem(String id, String title, String author, String isbn, String publisher, int numberOfCopies, Status status) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.numberOfCopies = numberOfCopies;
        this.status = status;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void borrowItem(Patron patron) {
        if (status == Status.AVAILABLE && numberOfCopies > 0) {
            numberOfCopies--;
            if (numberOfCopies == 0) {
                status = Status.CHECKED_OUT;
            }
            patron.getBorrowedItems().add(this);
            System.out.println("Item borrowed successfully.");
        } else {
            System.out.println("Item is not available.");
        }
    }

    @Override
    public void returnItem(Patron patron) {
        numberOfCopies++;
        if (status == Status.CHECKED_OUT) {
            status = Status.AVAILABLE;
        }
        patron.getBorrowedItems().remove(this);
        System.out.println("Item returned successfully.");
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", numberOfCopies=" + numberOfCopies +
                ", status=" + status +
                '}';
    }
}
