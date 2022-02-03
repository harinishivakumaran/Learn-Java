package assignments;

import java.util.*;
import java.time.*;
import java.time.format.*;
public class MallParkingSystem {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String currTime="29/10/2019 20:10";
		System.out.println("In-time");
		String enterTime=sc.nextLine();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");  
		LocalDateTime date1=LocalDateTime.parse(currTime,dtf);
		try {
			LocalDateTime date2=LocalDateTime.parse(enterTime,dtf);
			if(!date2.isBefore(date1)) {
				System.out.println(enterTime+" is an Invalid In-time");
				System.exit(0);
			}
			System.out.println("Out-time");
			String exitTime=sc.nextLine();
			try {
				LocalDateTime date3=LocalDateTime.parse(exitTime,dtf);
				if(!date3.isAfter(date2)) {
					System.out.println(exitTime+" is an Invalid Out-time");
					System.exit(0);
				}
				Duration duration=Duration.between(date2,date3);
				long milliseconds=duration.toMillis();
				long hours=duration.toHours();
				if(milliseconds%(1000*60*60)!=0) {
					hours+=1;
				}
				System.out.println(hours*10 + " Rupees");
			}catch(DateTimeException e) {
				System.out.println(exitTime+" is an Invalid Out-Time");
				System.exit(0);
			}
		}catch(DateTimeException e) {
			System.out.println(enterTime+ " is an Invalid In-time");
		}
		
		
		
	}

}
