package java.com.lib;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Lib {
    String bookName;
    String bookId;
    String returnDate;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public Lib(String bookName, String bookId, String returnDate) {
        this.bookName = bookName;
        this.bookId = bookId;
        this.returnDate = returnDate;
    }

    public Lib() {
        // Default constructor
    }

    @Override
    public String toString() {
        return "Lib [bookName=" + bookName + ", bookId=" + bookId + ", returnDate=" + returnDate + "]";
    }
}

public class Library {
    public static void main(String[] args) {
        List<Lib> libOp = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        // Sample data
        libOp.add(new Lib("b1", "a1", "04-05-2020"));
        libOp.add(new Lib("b2", "a2", "05-05-2020"));
        libOp.add(new Lib("b3", "a3", "06-05-2020"));

        while (true) {
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Update Book");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    add(libOp);
                    break;
                case 2:
                    show(libOp);
                    break;
                case 3:
                    update(libOp);
                    break;
                case 4:
                    System.out.println("Exiting Library System.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }

    public static String add(List<Lib> libOp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name:");
        String bookName = sc.next();
        System.out.println("Enter the book ID:");
        String ID = sc.next();
        System.out.println("Enter the return date:");
        String returnDate = sc.next();

        Lib addLib = new Lib(bookName, ID, returnDate);
        libOp.add(addLib);
        System.out.println("Successfully added.");
        return "Completed";
    }

    public static String show(List<Lib> libOp) {
        System.out.println("\nBooks in Library:");
        for (Lib lib : libOp) {
            System.out.println(lib);
        }
        return "Showed Successfully";
    }

    public static String update(List<Lib> libOp) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the book name to update:");
        String bookName = sc.next();
        System.out.println("Enter the book ID to update:");
        String ID = sc.next();
        System.out.println("Enter the new return date:");
        String returnDate = sc.next();

        boolean updated = false;
        for (Lib lib : libOp) {
            if (lib.getBookId().equalsIgnoreCase(ID) && lib.getBookName().equalsIgnoreCase(bookName)) {
                lib.setReturnDate(returnDate);
                updated = true;
                System.out.println("Return date updated successfully.");
                break;
            }
        }

        if (!updated) {
            System.out.println("Book not found.");
        }

        return "Update Completed";
    }
}
