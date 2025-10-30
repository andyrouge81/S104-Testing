package level1.exercise1.main;

import level1.exercise1.dataClass.Book;
import level1.exercise1.dataClass.Library;

public class Main {
	public static void main(String[] args) {


		Library library1 = new Library();


        System.out.println(library1.showLibrary());

		System.out.println("Adding a new book, 'Planet Uranus' in the library.");
		Book book5 = new Book("Planet Uranus", "Rudolf Caspino");
        library1.getBooks().add(4, book5);


        System.out.println("\n"+library1.showLibrary());
		System.out.println();
		System.out.println("Searching a book at the index 3...");
		String actualTitle = library1.getBooks().get(3).getTitle();
		System.out.println("The book in the index 3 is: "+actualTitle);

		System.out.println();
		System.out.println("Adding a new book in the library.");
		Book book6  = new Book("Planet Neptune", "Arthur C Kirke");

        library1.addBook(book6);

        System.out.println(library1.showLibrary());

		System.out.println();
		System.out.println("Delete 'Planet Uranus' to the library.");
        library1.deleteBook("Planet Uranus");

		System.out.println();
		System.out.println(library1.showLibrary());



	}
}
