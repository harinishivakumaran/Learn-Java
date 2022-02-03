package java.collections;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		PhoneBook p=new PhoneBook();
		while(true) {
			System.out.println("Menu\n1.Add Contact\n2.Display all contacts\n3.Search contact by phone\n4.Remove contact\n5.Exit\nEnter your choice:\n");
			int n=sc.nextInt();
			if(n==1) {
				System.out.println("Add a Contact:");
				System.out.println("Enter the First Name:");
				String fname=sc.next();
				System.out.println("Enter the Last Name:");
				String lname=sc.next();
				System.out.println("Enter the Phone No.:");
				long phn=sc.nextLong();
				System.out.println("Enter the Email:");
				String emailid=sc.next();
				Contact c=new Contact(fname,lname,phn,emailid);
				p.addContact(c);
			}else if(n==2) {
				System.out.println("The contacts in the List are:");
				for(Contact c:p.viewAllContacts()) {
					System.out.println("First Name: "+c.getFirstName());
					System.out.println("Last Name: "+c.getLastName());
					System.out.println("Phone No.: "+c.getPhoneNumber());
					System.out.println("Email: "+c.getEmailId());
				}
			}else if(n==3) {
				System.out.println("Enter the Phone number to search contact:");
				long phnno=sc.nextLong();
				Contact c=p.viewContactGivenPhone(phnno);
				if(c!=null) {
					System.out.println("The contact is:");
					System.out.println("First Name: "+c.getFirstName());
					System.out.println("Last Name: "+c.getLastName());
					System.out.println("Phone No.: "+c.getPhoneNumber());
					System.out.println("Email: "+c.getEmailId());
				}
			}else if(n==4) {
				System.out.println("Enter the Phone number to remove :");
				long phnno=sc.nextLong();
				System.out.println("Do you want to remove the contact (Y/N):");
				char ch=sc.next().charAt(0);
				if(ch=='Y' || ch=='y') {
					if(p.removeContact(phnno)) {
						System.out.println("The contact is successfully deleted.");
					}
				}
			}else if(n==5){
				break;
			}
			
			
		}
		sc.close();

	}

}
