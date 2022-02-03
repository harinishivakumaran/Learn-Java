package java.collections;

import java.util.*;
public class BMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Library l=new Library();
		while(true) {
			System.out.println("1.Add Book\n2.Display all book details\n3.Search Book by author\n4.Count number of books - by book name\n5.Exit\nEnter your choice:");
			int n=Integer.parseInt(sc.nextLine());
			if(n==1) {
				System.out.println("Enter the isbn no:");
				int isbn=sc.nextInt();
				System.out.println("Enter the book name:");
				String bname=sc.next();
				sc.nextLine();
				System.out.println("Enter the author name");
				String author=sc.next();
				sc.nextLine();
				Book b=new Book();
				b.setIsbnno(isbn);
				b.setBookName(bname);
				b.setAuthor(author);
				l.addBook(b);
			}else if(n==2) {
				for(Book i:l.viewAllBooks()) {
					System.out.println("Isbn no "+i.getIsbnno());
					System.out.println("Book name "+i.getBookName());
					System.out.println("Author name "+i.getAuthor());
					
				}
			}else if(n==3) {
				System.out.println("Enter the author name:");
				String author=sc.nextLine();
				ArrayList<Book> bc=l.viewBooksByAuthor(author);
				if(!bc.isEmpty()) {
					for(Book ip:bc) {
						System.out.println("ISBN no: "+ip.getIsbnno());
						System.out.println("Book name: "+ip.getBookName());
						System.out.println("Author  name: "+ip.getAuthor());
					}
				}else {
					System.out.println("None of the book published by the author "+author);
				}
			}else if(n==4) {
				System.out.println("Enter the book name:");
				String bname=sc.nextLine();
				System.out.println("Count of "+bname+l.countnoofbook(bname));
			}else {
				break;
			}
		}
		
	}

}