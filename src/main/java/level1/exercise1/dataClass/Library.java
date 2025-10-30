package level1.exercise1.dataClass;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.List;

public class Library implements Comparable<Book> {

	private List<Book> library;


	public Library() {

		this.library = new ArrayList<>();
		addBooksToLibrary(this.library);

	}


	public List<Book> getBooks() {

		return this.library;
	}

	@Override
	public int compareTo(Book o) {
		for(int i=0;i< library.size();i++){
			int compareName = this.library.get(i).getAutor().compareTo(o.getAutor());
			if (compareName == 0){

			return compareName;
			}
		}
		return 0;
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

	private void addBooksToLibrary(List<Book> books){
		books.add(new Book("Planet Earth","John Silverman"));
		books.add( new Book("Planet Saturn","Steve Goldman"));
		books.add(new Book("Planet Saturn","Frank Coverman"));
		books.add(new Book("Planet Mars","Dimitry Stalinskov"));

	}
}
