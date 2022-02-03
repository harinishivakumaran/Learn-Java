package java.collections;

import java.util.*;

public class Library {
	
	private ArrayList<Book> bookList=new ArrayList<Book>();

	public ArrayList<Book> getBookList() {
		return bookList;
	}

	public void setBookList(ArrayList<Book> bookList) {
		this.bookList = bookList;
	}
	
	public void addBook(Book bobj) {
		bookList.add(bobj);
	}
	public boolean isEmpty() {
		return bookList.isEmpty();
			
	}
	public ArrayList<Book> viewAllBooks() {
		return getBookList();
	}
	public ArrayList<Book> viewBooksByAuthor(String author) {
		ArrayList<Book> ba=new ArrayList<>();
		for(Book b:bookList ) {
			if(b.getAuthor().equals(author)) {
				ba.add(b);
			}
		}
		return ba;
	}
	public int countnoofbook(String bname) {
		int c=0;
		for(Book b:bookList) {
			if(b.getBookName().equals(bname)) {
				c++;
			}
		}
		return c;
	}
}
