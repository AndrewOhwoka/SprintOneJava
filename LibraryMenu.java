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
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Adding a new library item...");
                    LibraryItem newItem = new Book(); // Example, could be a Periodical or other item
                    newItem.setId("1"); // Set other properties similarly
                    library.addLibraryItem(newItem);
                    break;
                case 2:
                    System.out.println("Editing an existing library item...");
                    System.out.print("Enter the ID of the item to edit: ");
                    String editId = scanner.next();
                    LibraryItem editItem = new Book(); // Example, could be a Periodical or other item
                    editItem.setId(editId); // Set other properties similarly
                    library.editLibraryItem(editId, editItem);
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
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}