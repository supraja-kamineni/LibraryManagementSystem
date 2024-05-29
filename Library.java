package libraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books;
    private List<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getBookName());
    }

    // Add a user to the library system
    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getStudentName());
    }

    // Issue a book to a user
    public void issueBook(String bookName, int studentId) {
        Book book = findBook(bookName);
        if (book != null) {
            User user = findUser(studentId);
            if (user != null) {
                books.remove(book);
                System.out.println("Book issued: " + bookName + " to " + user.getStudentName());
            } else {
                System.out.println("User not found.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    // Return a book to the library
    public void returnBook(Book book) {
        books.add(book);
        System.out.println("Book returned: " + book.getBookName());
    }

    // Find a book by name
    private Book findBook(String bookName) {
        for (Book book : books) {
            if (book.getBookName().equalsIgnoreCase(bookName)) {
                return book;
            }
        }
        return null;
    }

    // Find a user by ID
    private User findUser(int studentId) {
        for (User user : users) {
            if (user.getStudentId() == studentId) {
                return user;
            }
        }
        return null;
    }

    // Display all books
    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available.");
        } else {
            System.out.println("Books available in the library:");
            for (Book book : books) {
                System.out.println(book.getBookName() + " by " + book.getAuthor() + " (Edition: " + book.getEdition() + ")");
            }
        }
    }

    // Display all users
    public void displayUsers() {
        if (users.isEmpty()) {
            System.out.println("No users available.");
        } else {
            System.out.println("Users in the library system:");
            for (User user : users) {
                System.out.println(user.getStudentName() + " (ID: " + user.getStudentId() + ", Course: " + user.getCourse() + ")");
            }
        }
    }
}
