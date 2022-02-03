package assignments;

import java.util.*;

public class UserInterface {
    
	
    public static CommissionInfo generateCommissionObtained (){
        CommissionInfo c = t -> {
        	String ct=t.getClassType();
        	double com=0;
    		if(ct.equals("SL") ||ct.equals("2S")) {
    			com=60;
    		}else if(ct.equals("1A") || ct.equals("2A") || ct.equals("3A")) {
    			com=100;
    		}
			return com;
        };
        return c;
    }
    
    public static void main(String args[]) {
    	//UserInterface u=new UserInterface();
        List<Ticket>  arr=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of passengers");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	Ticket ticket=null;
        	System.out.println("Details of Passenger "+i+":");
        	System.out.println("Enter the pnr no:");
        	long pnrNo=sc.nextLong();
        	//ticket.setPnrNo(pnrNo);
        	System.out.println("Enter passenger name:");
        	String passengerName=sc.next();
        	//ticket.setPassengerName(passengerName);
        	sc.nextLine();
        	System.out.println("Enter seat no:");
        	int seatNo=sc.nextInt();
        	//ticket.setSeatNo(seatNo);
        	System.out.println("Enter class type:");
        	String classType=sc.next();
        	//ticket.setClassType(classType);
        	sc.nextLine();
        	System.out.println("Enter ticket fare:");
        	double ticketFare=sc.nextDouble();
        	//ticket.setTicketFare(ticketFare);
        	ticket=new Ticket(pnrNo,passengerName,seatNo,classType,ticketFare);
        	arr.add(ticket);
        }
        double d = 0;
        for(Ticket t:arr) {
        	CommissionInfo c=generateCommissionObtained();
        	d += c.calculateCommissionAmount(t);
        }
        System.out.println("Commission Obtained");
        System.out.printf("Commission obtained per each person: Rs.%.2f",d);
        
    }
    
}