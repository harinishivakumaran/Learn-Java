package oopsconcept;

import java.util.*;

public class TicketRunner {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Ticket t=new Ticket();
		System.out.println("Enter no of bookings:");
		int n=sc.nextInt();
		System.out.println("Enter the available tickets:");
		int atick=sc.nextInt();
		t.setAvailableTickets(atick);
		while(n-->0) {
			System.out.println("Enter the ticketid:");
			int tid=sc.nextInt();
			t.setTicketid(tid);
			System.out.println("Enter the price:");
			int tp=sc.nextInt();
			t.setPrice(tp);
			System.out.println("Enter the no of tickets:");
			int not=sc.nextInt();
			System.out.printf("Available tickets: %d\n",t.getAvailableTickets());
			int total=t.calculateTicketCost(not);
			int availticketsafter=t.getAvailableTickets() ;
			System.out.printf("Total amount:%d\n",total);
			System.out.printf("Available ticket after booking:%d\n",availticketsafter);
		}
	}

}
