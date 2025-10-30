package level1.exercise1.dataClass;

public class Book {


	private String title;
	private String author;
	private static int ISBN = 1;
	private int idISBN;


	public Book(String title, String autor){
		this.title = title;
		this.author = autor;
		this.idISBN =ISBN++;

	}


	public String getTitle(){
		return this.title;}

	public String getAutor(){
		return this.author;}


	@Override
	public String toString(){
		return String.format("\nTitle: %s - Autor: %s - ISBN: %d",getTitle(),getAutor(),this.idISBN);
	}
}


