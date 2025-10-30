package level1.exercise1.dataClass;

import java.util.ArrayList;


import java.util.List;

public class Library {

	private List<Book> library;


	public Library() {

		this.library = new ArrayList<>();

	}


	public List<Book> getBooks() {

		return this.library;
	}





	public void addBook(Book newBook){
		for(Book b : this.library){
			if(b.getTitle().equalsIgnoreCase(newBook.getTitle())){
				System.out.println("The book already exists.");
				return;
			}
		}
		this.library.add(newBook);

	}


	public String showLibrary(){
		return "Books in the library: "+ getBooks();
	}



	public void deleteBook(String title){

		for(Book bk : this.library){
			if(bk.getTitle().equalsIgnoreCase(title)){
				this.library.remove(bk);

				System.out.println("Book erased.");
				return;
			}
		}

		System.out.println("This Book doesn't exit in the library.");

	}

	public void addBooksToLibrary(){
		library.add(new Book("Planet Earth","John Silverman"));
		library.add( new Book("Planet Saturn","Steve Goldman"));
		library.add(new Book("Planet Saturn","Frank Coverman"));
		library.add(new Book("Planet Mars","Dimitry Stalinskov"));

	}
}
