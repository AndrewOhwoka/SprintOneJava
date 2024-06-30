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
            System.out.println("13. Print Everything!");

            System.out.print("Enter your choice (1-12): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add a library item
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
                    LibraryItem libraryItem = new LibraryItem(libraryItemId,libraryItemTitle,libraryItemAuthor,libraryItemIsbn,libraryItemPublisher,libraryItemNumberOfCopies,Status.AVAILABLE);
                    library.addLibraryItem(libraryItem);

                    // Take Author Name and do a check then add the item to their list of items written.
                    library.checkAuthorList(libraryItemAuthor,libraryItem);

                    library.printitems();
                    break;
                case 2:
                // Edit a library item
                System.out.println("Enter the ID of the library item to edit: ");
                String itemId = scanner.next();
                LibraryItem itemToEdit = library.getLibraryItemById(itemId);
                if (itemToEdit != null) {
                    System.out.println("Enter new title: ");
                    String newTitle = scanner.next();
                    itemToEdit.setTitle(newTitle);
                    System.out.println("Enter new author: ");
                    String newAuthor = scanner.next();
                    itemToEdit.setAuthor(newAuthor);
                    System.out.println("Enter new ISBN: ");
                    String newIsbn = scanner.next();
                    itemToEdit.setIsbn(newIsbn);
                    System.out.println("Enter new publisher: ");
                    String newPublisher = scanner.next();
                    itemToEdit.setPublisher(newPublisher);
                    System.out.println("Enter new number of copies: ");
                    int newNumberOfCopies = scanner.nextInt();
                    itemToEdit.setNumberOfCopies(newNumberOfCopies);
                    System.out.println("Library item edited successfully.");
                    library.printitems();
                } else {
                    System.out.println("No library item found with the provided ID.");
                }
                    break;
                case 3:
                    // Delete a library item
                    System.out.println("Deleting a library item...");
                    System.out.print("Enter the ID of the item to delete: ");
                    String deleteId = scanner.next();
                    boolean isDeleted = library.deleteLibraryItem(deleteId);
                    if (isDeleted) {
                     System.out.println("Library item deleted successfully.");
                    library.printitems();
                    } else {
                     System.out.println("No library item found with the provided ID.");
                    } 
                    break;
                case 4:
                    // Borrow a library item
                    System.out.println("Borrowing a library item...");
                    System.out.println("Enter the title of the item to borrow: ");
                    String borrowTitle = scanner.next();
                    System.out.println("Enter your name: ");
                    String name = scanner.next();
                    System.out.println("Enter your address: ");
                    String address = scanner.next();
                    System.out.println("Enter your phone number: ");
                    String phoneNumber = scanner.next();
                    System.out.println("Enter your employee ID: ");
                    String employeeId = scanner.next();
                    System.out.println("Enter your department: ");
                    String department = scanner.next();
                    Patron patron = new Employee(name, address, phoneNumber, new ArrayList<>(), employeeId, department);
                    library.borrowLibraryItem(borrowTitle, patron);
                    break;
                case 5:
                    // Return a library item
                    System.out.println("Returning a library item...");
                    System.out.println("Enter the title of the item to return: ");
                    String returnTitle = scanner.next();
                    System.out.println("Enter your name: ");
                    String nameReturn = scanner.next();
                    System.out.println("Enter your address: ");
                    String addressReturn = scanner.next();
                    System.out.println("Enter your phone number: ");
                    String phoneNumberReturn = scanner.next();
                    System.out.println("Are you an Employee or a Student? (E/S): ");
                    String patronType = scanner.next();
                    Patron returnPatron = null;
                    if (patronType.equalsIgnoreCase("E")) {
                        System.out.println("Enter your employee ID: ");
                        String employeeIdReturn = scanner.next();
                        System.out.println("Enter your department: ");
                        String departmentReturn = scanner.next();
                        returnPatron = new Employee(nameReturn, addressReturn, phoneNumberReturn, new ArrayList<>(), employeeIdReturn, departmentReturn);
                    } else if (patronType.equalsIgnoreCase("S")) {
                        System.out.println("Enter your student ID: ");
                        String studentId = scanner.next();
                        System.out.println("Enter your course: ");
                        String course = scanner.next();
                        returnPatron = new Student(nameReturn, addressReturn, phoneNumberReturn, new ArrayList<>(), studentId, course);
                    }
                    if (returnPatron != null) {
                        library.returnLibraryItem(returnTitle, returnPatron);
                    } else {
                        System.out.println("Invalid patron type. Please enter E for Employee or S for Student.");
                    }
                    break;
                case 6:
                    // Add an author
                    System.out.println("Enter Author Name: ");
                    String authorName = scanner.next();
                    System.out.println("Enter date of birth: ");
                    String authorDateOfBirth = scanner.next();
                    Author author = new Author(authorName,authorDateOfBirth);
                    library.addAuthor(author);
                    library.printAuthors();
                    break;
                case 7:
                    // Edit an author
                    System.out.println("Editing an author...");
                    System.out.print("Enter the name of the author to edit: ");
                    String editAuthorName = scanner.next();
                    System.out.print("Enter the new Name: ");
                    String editAuthorName1 = scanner.next();
                    System.out.print("Enter the new date of birth: ");
                    String editAuthorDateOfBirth = scanner.next();
                    System.out.print("Enter the new list of items: ");
                    String editAuthorListOfItems = scanner.next();
                    boolean isEdit = library.editAuthor(editAuthorName, editAuthorDateOfBirth);
                    if (isEdit) {
                        System.out.println("Author edited successfully.");
                        library.printAuthors();
                    } else {
                        System.out.println("No author found with the provided name.");
                    }
                break;
                case 8:
                    // Delete an author
                    System.out.println("Enter the Name of the author you want to delete: ");
                    String authorNamed = scanner.next();
                    boolean isDeletedd = library.deleteAuthor(authorNamed);
                    if (isDeletedd) {
                        System.out.println("Author deleted successfully.");
                        library.printPatrons();
                    } else {
                        System.out.println("No author found with the Name.");
                    }
                    break;

                    // System.out.println("Deleting an author...");
                    // System.out.print("Enter the name of the author to delete: ");
                    // String deleteAuthorName = scanner.next();
                    // boolean isAuthorDeleted = library.deleteAuthor(deleteAuthorName);
                    // if (isAuthorDeleted) {
                    // System.out.println("Author deleted successfully.");
                    // library.printAuthors();
                    // } else {
                    // System.out.println("No author found with the provided name.");
                    // }

                case 9:
                    // Add a patron
                    System.out.println("Enter Patron Name: ");
                    String patronName = scanner.next();
                    System.out.println("Enter Patron address: ");
                    String patronAddress = scanner.next();
                    System.out.println("Enter Patron phone number: ");
                    String patronPhoneNumber = scanner.next();
                    System.out.println("Enter Patron list of items: ");
                    String patronListOfitems = scanner.next();
                    Patron patron1 = new Patron(patronName,patronAddress,patronPhoneNumber);
                    library.addPatron(patron1);
                    library.printPatrons();
                    break;
                case 10:
                    // Edit a patron// Edit a patron
                    System.out.println("Enter Name of the patron to edit: ");
                    String patronIdOrNameEdit = scanner.next();
                    System.out.println("Edit Patron Name: ");
                    String editPatronName = scanner.next();
                    System.out.println("Edit Patron address: ");
                    String editPatronAddress = scanner.next();
                    System.out.println("Edit Patron phone number: ");
                    String editPatronPhoneNumber = scanner.next();
                    System.out.print("Enter Patron Name: ");
                    Patron editedPatron = new Patron(editPatronName, editPatronAddress, editPatronPhoneNumber);
                    boolean isUpdated = library.editPatron(patronIdOrNameEdit, editedPatron);
                    if (isUpdated) {
                        System.out.println("Patron details updated successfully.");
                        library.printPatrons();
                    } else {
                        System.out.println("No patron found with the6 Name.");
                    }
                    break;
                case 11:
                    // Delete a patron
                    System.out.println("Enter the Name of the patron to delete: ");
                    String patronIdOrName = scanner.next();
                    boolean isDeleteddd = library.deletePatron(patronIdOrName);
                    if (isDeleteddd) {
                        System.out.println("Patron deleted successfully.");
                        library.printPatrons();
                    } else {
                        System.out.println("No patron found with the Name.");
                    }
                    break;
                case 12:
                    // Exit the system
                    System.out.println("Exiting the system. Goodbye!");
                    break;
                case 13:
                    library.printAuthors();
                    library.printitems();
                    library.printPatrons();

                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 13.");
            }
        } while (choice != 13);

        scanner.close();
    }
}