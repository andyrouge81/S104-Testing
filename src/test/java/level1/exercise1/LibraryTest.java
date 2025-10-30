/**package level1.exercise1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LibraryTest {

	@Test
	void givenList_whenCreateObject_thenListISNotNull() {

		Library library1 = new Library();

		Book book3 = new Book("Planet Mercury","Frank Coverman");
		library1.addBook(book3);

		assertNotNull(library1.showLibrary(),"The library shouldn't be null after creating a new library object");

	}

	@Test
	void givenTwoBooks_whenAddBooks_thenConfirmListHasExpectedSize(){
		Library library2 = new Library();


		Book book3 = new Book("Planet Mercury","Frank Coverman");
		Book book4 = new Book("Planet Mars","Dimitry Stalinskov");

		library2.addBook(book3);
		library2.addBook(book4);

		int actualSize = library2.getBooks().size();

		assertEquals(2, actualSize);
	}

	@Test
	void givenAList_whenAddingBook_thenTheBookCorrectIndex(){

		Library library2 = new Library();


		Book book5 = new Book("Planet Urane", "Rudolf Caspino");
		library2.addBook(book5);

		int expectedIndex = 0;
		int actualIndex = library2.getBooks().indexOf(book5);

		assertEquals(expectedIndex, actualIndex);

	}


	@Test
	void givenTwoBooksWithSameName_whenAddTwoBooks_thenNameBooksNotDuplicate(){

		Library library1 = new Library();

		Book book1 = new Book("Planet Earth","John Silverman");
		Book book2 = new Book("Planet Earth","Steve Goldman");


		library1.addBook(book1);
		library1.addBook(book2);

		int i =0;
		for(Book k : library1.getBooks()){
			if(k.getTitle().equalsIgnoreCase(book1.getTitle())){
				i++;
			}
		}

		assertEquals(1, i);
	}



	@DisplayName("Show a title book when enter an index Library list")
	@Test
	void givenAListBooks_whenEnterAnIndexBook_thenShowTheTitleBook(){

		Library library1 = new Library();

		Book book2 = new Book("Planet Earth","Steve Goldman");
		Book book3 = new Book("Planet Pluto","Larry Leftman");
		library1.addBook(book2);
		library1.addBook(book3);


		String expectedTitle = "Planet Pluto";

		String actualTitle = library1.getBooks().get(1).getTitle();


		assertEquals(expectedTitle, actualTitle, "Index out of range, this tittle has no match with the expected");


	}



	@DisplayName("When add a book, see the List has been modiificated.")
	@Test
	void givenAListBooks_whenAddBook_thenSeeTheModifiedList(){

		Library library = new Library();

		Book book3 = new Book("Planet Saturn","Frank Coverman");
		Book book4 = new Book("Planet Mars","Dimitry Stalinskov");

		library.addBook(book3);
		int expectedList = library.getBooks().size();

		library.addBook(book4);

		int newList = library.getBooks().size();


		assertTrue(expectedList < newList, "The List has not been modified. It doesn´t add new book to the List");

	}




	@DisplayName("When deleting a Book, decrease of elements and size of the List.")
	@Test
	void givenAListBooks_whenDeleteABook_thenListSizeDecreases() {

		Library library = new Library();
		Book book1 = new Book("Planet Saturn", "Frank Coverman");


		library.addBook(book1);
		int expectedList = library.getBooks().size();

		library.deleteBook("Planet Saturn");
		int actualList = library.getBooks().size();


		assertTrue(expectedList > actualList, "The delete method does not working, the list size has not decreased.");
		assertFalse(library.getBooks().contains(book1),"The book still in the list, the list size has not changed");
	}


	@DisplayName("Verify a sorted List after add or delete an object book.")
	@Test
	void givenAListBooks_whenAddOrDeleteBooks_thenTitleBooksAlphabeticallySorted(){

		Library library = new Library();
		Book book1 = new Book("Planet Saturn", "Frank Coverman");
		Book book2 = new Book("Planet Mars", "Rick Fleshman");
		Book book3 = new Book("Planet Earth", "Morty Jazzman");

		library.addBook(book2);
		library.addBook(book3);
		library.addBook(book1);

		library.deleteBook("Planet Mars");

		List<Book> listBooks = library.getBooks();

		List<String> booktitles = new ArrayList<>();

		for(Book bk : listBooks){
			booktitles.add(bk.getTitle());
		}
		boolean sortedList = true;

		for(int i = 0;i<booktitles.size()-1; i++){
			if((booktitles.get(i).compareTo(booktitles.get(i+1))>0)){
				sortedList = false;
				break;
			}
		}



		assertTrue(sortedList, "The List isn't sorted by book title.");


	}
}*/
