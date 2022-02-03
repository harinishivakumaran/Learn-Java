package oopsconcept;

public class Ticket {

	private int ticketid;
	private int price;
	private static int availableTickets;
	
	public int getTicketid() {
		return ticketid;
	}
	
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
		
	public static int getAvailableTickets() {
		return availableTickets;
	}
	
	public static void setAvailableTickets(int availTickets) {
		if(availTickets>0)
			availableTickets = availTickets;
	}
	public int calculateTicketCost(int nooftickets) {
		int tickets=getAvailableTickets();
		if(nooftickets>tickets) {
			return -1;
		}
		tickets=tickets-nooftickets;
		setAvailableTickets(tickets);
		return price*nooftickets;
		
	}
	

}
