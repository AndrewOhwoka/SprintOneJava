// LibraryItem.java
public abstract class LibraryItem implements Borrowable {
    protected String id;
    protected String title;
    protected String author;
    protected String isbn;
    protected String publisher;
    protected int numberOfCopies;
    protected Status status;

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
}
