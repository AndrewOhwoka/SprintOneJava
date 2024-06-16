// LibraryItem.java
public abstract class LibraryItem implements Borrowable {
    protected String id;
    protected String title;
    protected String author;
    protected String isbn;
    protected String publisher;
    protected int numberOfCopies;
    protected String status;

    // getters
    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public String getStatus() {
        return status;
    }

    // setters
    public void setId(String id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    // Getters and setters

    @Override
    public void borrowItem(String patron) {
        // Implement borrowing logic
    }

    @Override
    public void returnItem(String patron) {
        // Implement returning logic
    }
}
