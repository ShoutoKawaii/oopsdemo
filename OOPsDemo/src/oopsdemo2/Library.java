package oopsdemo2;

import java.util.List;

//compostion example
public class Library {
	
	List<Book> books;  //object reference -- Composition

	//constructor to initialize books ina a library
	public Library(List<Book> books) {
		this.books = books;
	}

	//getter() method
	public List<Book> getBooks() {
		return books;
	}
	
	

}
