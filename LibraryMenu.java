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
                    LibraryItem libraryItem = new LibraryItem(libraryItemId,libraryItemTitle,libraryItemAuthor,libraryItemIsbn,libraryItemPublisher,libraryItemNumberOfCopies,Status.AVAILABLE);
                    library.addLibraryItem(libraryItem);
                    library.printitems();
                    break;
                case 2:

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
                    library.addLibraryItem(itemToEdit); // Assuming you have an update method
                    library.printitems();
                } else {
                    System.out.println("No library item found with the provided ID.");
                }
                    // System.out.println("Edit Library Item ID: ");
                    // String editItemId = scanner.next();
                    // System.out.println("Edit Library Item Title: ");
                    // String editItemTitle = scanner.next();
                    // System.out.println("Edit Library Item Author: ");
                    // String editItemAuthor = scanner.next();
                    // System.out.println("Edit Library Item ISBN: ");
                    // String editItemIsbn = scanner.next();
                    // System.out.println("Edit Library Item Publisher: ");
                    // String editItemPublisher = scanner.next();
                    // System.out.println("Edit Library Item Number of Copies: ");
                    // int editItemNumberOfCopies = scanner.nextInt();
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



                    // System.out.println("Deleting a library item...");
                    // System.out.print("Enter the ID of the item to delete: ");
                    // String deleteId = scanner.next();
                    // library.deleteLibraryItem(deleteId);
                    break;
                case 4:
                    System.out.println("Borrowing a library item...");
                    System.out.print("Enter the title of the item to borrow: ");
                    String borrowTitle = scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter your address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter your employee ID: ");
                    String employeeId = scanner.nextLine();
                    System.out.print("Enter your department: ");
                    String department = scanner.nextLine();
                    Patron patron = new Employee(name, address, phoneNumber, new ArrayList<>(), employeeId, department);
                    library.borrowLibraryItem(borrowTitle, patron);
                    break;
                case 5:
                    // Return a library item
                    System.out.println("Returning a library item...");
                    System.out.print("Enter the title of the item to return: ");
                    String returnTitle = scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String nameReturn = scanner.nextLine();
                    System.out.print("Enter your address: ");
                    String addressReturn = scanner.nextLine();
                    System.out.print("Enter your phone number: ");
                    String phoneNumberReturn = scanner.nextLine();
                    System.out.print("Are you an Employee or a Student? (E/S): ");
                    String patronType = scanner.nextLine();
                    Patron returnPatron = null;
                    if (patronType.equalsIgnoreCase("E")) {
                        System.out.print("Enter your employee ID: ");
                        String employeeIdReturn = scanner.nextLine();
                        System.out.print("Enter your department: ");
                        String departmentReturn = scanner.nextLine();
                        returnPatron = new Employee(nameReturn, addressReturn, phoneNumberReturn, new ArrayList<>(), employeeIdReturn, departmentReturn);
                    } else if (patronType.equalsIgnoreCase("S")) {
                        System.out.print("Enter your student ID: ");
                        String studentId = scanner.nextLine();
                        System.out.print("Enter your course: ");
                        String course = scanner.nextLine();
                        returnPatron = new Student(nameReturn, addressReturn, phoneNumberReturn, new ArrayList<>(), studentId, course);
                    }
                    if (returnPatron != null) {
                        library.returnLibraryItem(returnTitle, returnPatron);
                    } else {
                        System.out.println("Invalid patron type. Please enter E for Employee or S for Student.");
                    }
                    // System.out.println("Returning a library item...");
                    // System.out.print("Enter the title of the item to return: ");
                    // String returnTitle = scanner.nextLine();
                    // System.out.print("Enter your name: ");
                    // String nameReturn = scanner.nextLine();
                    // System.out.print("Enter your address: ");
                    // String addressReturn = scanner.nextLine();
                    // System.out.print("Enter your phone number: ");
                    // String phoneNumberReturn = scanner.nextLine();
                    // System.out.print("Enter your employee ID: ");
                    // String employeeIdReturn = scanner.nextLine();
                    // System.out.print("Enter your department: ");
                    // String departmentReturn = scanner.nextLine();
                    // Patron returnPatron = new Employee(nameReturn, addressReturn, phoneNumberReturn, new ArrayList<>(), employeeIdReturn, department);
                    // library.returnLibraryItem(returnTitle, returnPatron);
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