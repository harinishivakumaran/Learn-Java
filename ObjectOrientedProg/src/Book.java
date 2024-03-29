import java.util.*;
public class Book {
	
	private int id;
	private String name;
	private String author;	
	private ArrayList<Review> reviews=new ArrayList<>();
	
	public Book(int id, String name, String author) {
		this.id=id;
		this.name=name;
		this.author=author;
	}
	public void addReview(Review review) {
		this.reviews.add(review);
	}
	public String toString() {
		return String.format("Id-%d name-%s author-%s Reviews-%s",id,name,author,reviews);
	}
	
}
