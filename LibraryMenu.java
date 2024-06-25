// LibraryMenu.java
import java.util.ArrayList;
import java.util.Scanner;

public class LibraryMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        Library library = new Library();

        do {
            System.out.println("Welcome to the Library Management System");
            System.out.println("1. Add Library Item");
            System.out.println("2. Edit Library Item");
            System.out.println("3. Delete Library Item");
            System.out.println("4. Borrow Library Item");
            System.out.println("5. Return Library Item");
            //add new authors, edit existing authors, and delete authors from the library. 
            System.out.println("6. Add Author");
            System.out.println("7. Edit Author");
            System.out.println("8. Delete Author");
            //add new patrons, edit existing patrons, and delete patrons from the library.
            System.out.println("9. Add Patron");
            System.out.println("10. Edit Patron");
            System.out.println("11. Delete Patron");

            System.out.println("12. Exit");
            System.out.print("Enter your choice (1-12): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Library Item ID: ");
                    String libraryItemId = scanner.next();
                    System.out.println("Enter Library Item Title: ");
                    String libraryItemTitle = scanner.next();
                    System.out.println("Enter Library Item Author: ");
                    String libraryItemAuthor = scanner.next();
                    System.out.println("Enter Library Item ISBN: ");
                    String libraryItemIsbn = scanner.next();
                    System.out.println("Enter Library Item Publisher: ");
                    String libraryItemPublisher = scanner.next();
                    System.out.println("Enter Library Item Number of Copies: ");
                    int libraryItemNumberOfCopies = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Edit Library Item ID: ");
                    String editItemId = scanner.next();
                    System.out.println("Edit Library Item Title: ");
                    String editItemTitle = scanner.next();
                    System.out.println("Edit Library Item Author: ");
                    String editItemAuthor = scanner.next();
                    System.out.println("Edit Library Item ISBN: ");
                    String editItemIsbn = scanner.next();
                    System.out.println("Edit Library Item Publisher: ");
                    String editItemPublisher = scanner.next();
                    System.out.println("Edit Library Item Number of Copies: ");
                    int editItemNumberOfCopies = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("Deleting a library item...");
                    System.out.print("Enter the ID of the item to delete: ");
                    String deleteId = scanner.next();
                    library.deleteLibraryItem(deleteId);
                    break;
                case 4:
                    System.out.println("Borrowing a library item...");
                    System.out.print("Enter the title of the item to borrow: ");
                    String borrowTitle = scanner.next();
                    Patron patron = new Employee("Jane Smith", "456 Elm St", "555-1234", new ArrayList<>(), "E789012", "HR"); // Example, could be a Student or other patron
                    library.borrowLibraryItem(borrowTitle, patron);
                    break;
                case 5:
                    System.out.println("Returning a library item...");
                    System.out.print("Enter the title of the item to return: ");
                    String returnTitle = scanner.next();
                    Patron returnPatron = new Employee("Jane Smith", "456 Elm St", "555-1234", new ArrayList<>(), "E789012", "HR"); // Example, could be a Student or other patron
                    library.returnLibraryItem(returnTitle, returnPatron);
                    break;
                case 6:
                    
                    // author
                    System.out.println("Enter Author Name: ");
                    String authorName = scanner.next();
                    System.out.println("Enter date of birth: ");
                    String authorDateOfBirth = scanner.next();
                    System.out.println("Enter Author list of items: ");
                    String authorListOfitems = scanner.next();
                    break;
                case 7:
                    System.out.println("Edit Author Name: ");
                    String editAuthorName = scanner.next();
                    System.out.println("Editg date of birth: ");
                    String editAuthorDateOfBirth = scanner.next();
                    System.out.println("Edit Author list of items: ");
                    String edithAuthorListOfitems = scanner.next();
                    break;
                case 8:
                    System.out.print("Delete Author: ");
                    String deleteAuthor = scanner.next();
                    break;
                case 9:

                    // patron
                    System.out.println("Enter Patron Name: ");
                    String patronName = scanner.next();
                    System.out.println("Enter Patron address: ");
                    String patronAddress = scanner.next();
                    System.out.println("Enter Patron phone number: ");
                    String patronPhoneNumber = scanner.next();
                    System.out.println("Enter Patron list of items: ");
                    String patronListOfitems = scanner.next();
                    break;
                case 10:
                    System.out.println("Edit Patron Name: ");
                    String editPatronName = scanner.next();
                    System.out.println("Edit Patron address: ");
                    String editPatronAddress = scanner.next();
                    System.out.println("Edit Patron phone number: ");
                    String editPatronPhoneNumber = scanner.next();
                    System.out.println("Edit Patron list of items: ");
                    String editPatronListOfitems = scanner.next();
                break;
                case 11:
                    System.out.print("Delete Patron: ");
                    String deletePatron = scanner.next();
                    break;
                case 12:
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 12.");
            }
        } while (choice != 12);

        scanner.close();
    }
}