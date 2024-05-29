package libraryManagementSystem;

public class MainLogic {

	public static void main(String[] args) {
		 Library library = new Library();

	        library.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1));
	        library.addBook(new Book("1984", "George Orwell", 1));
	        library.addBook(new Book("To Kill a Mockingbird", "Harper Lee", 1));
	        library.addBook(new Book("python","Denis riche",3));

	        // Add some users
	        library.addUser(new User(1, "Supraja", "Computer Science"));
	        library.addUser(new User(2, "Kushwanth", "Computer Science"));
	        library.addUser(new User(3,"Chaithanya","Computer Science"));

	        // Display all books
	        library.displayBooks();

	        // Display all users
	        library.displayUsers();

	        // Issue a book
	        library.issueBook("1984", 1);

	        // Display all books after issuing one
	        library.displayBooks();

	        // Return a book
	        library.returnBook(new Book("1984", "George Orwell", 1));

	        // Display all books after returning one
	        library.displayBooks();

	}

}
