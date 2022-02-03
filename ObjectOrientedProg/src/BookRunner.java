
public class BookRunner {

public static void main(String[] args) {
		Book book=new Book(32,"2States","Bhagat");
		book.addReview(new Review(10,"great",5));
		book.addReview(new Review(101,"good",5));
		System.out.println(book);
	}

}
