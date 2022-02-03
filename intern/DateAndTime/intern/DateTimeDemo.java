package intern;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateTimeDemo {
	
	private static void testLegacyDateAPI() {
		
		System.out.println("\nDate class ... ");
		Date currentDate=new Date();
		System.out.println("currentDate: "+currentDate);
		System.out.println("currentDate in ms: "+currentDate.getTime());
		System.out.println("\nCalendar class ... ");
		Calendar expiryDate=new GregorianCalendar(2021,01,01);
		System.out.println("expiry date: "+expiryDate);
		System.out.println("expiry date: "+expiryDate.getTime());
		expiryDate.add(Calendar.MONTH,4);
		System.out.println("new expiry date: "+expiryDate.getTime());
		expiryDate.roll(Calendar.MONTH,4);
		System.out.println("new expiry date: "+expiryDate.getTime());
		String[] timeZones=TimeZone.getAvailableIDs();
		for(String t:timeZones) {
			System.out.println(t);
		}
		//isAfter isBefrore methods available.
		LocalDate eDate=LocalDate.of(2020, Month.APRIL, 14);
		LocalDate newExpiryDate=eDate.plusMonths(8);
		System.out.println("year: "+newExpiryDate.getYear());
		System.out.println("Month: "+newExpiryDate.getMonth());
		System.out.println(newExpiryDate.getDayOfMonth());
		System.out.println(newExpiryDate.getDayOfWeek());
		System.out.println(newExpiryDate.getDayOfYear());
		System.out.println(newExpiryDate.isLeapYear());
		System.out.println(newExpiryDate.lengthOfMonth());
		System.out.println(newExpiryDate.lengthOfYear());
		//ChronoField is an enum
		System.out.println(newExpiryDate.get(ChronoField.YEAR));
		System.out.println(newExpiryDate.get(ChronoField.MONTH_OF_YEAR));
		System.out.println(newExpiryDate.get(ChronoField.DAY_OF_MONTH));
		
		LocalDate epoch=LocalDate.parse("1970-01-01"); //yyyy-mm-dd
		System.out.println("epoch year "+epoch.getYear());
		
		LocalTime time=LocalTime.of(9, 00,00);
		System.out.println("time--hr: "+time.getHour());
		
		LocalDate startDate=LocalDate.of(2017, Month.JULY, 03);
		LocalDateTime datetime=LocalDateTime.of(startDate, time);
		System.out.println("date and time: "+datetime);
		
		ZonedDateTime zdt=ZonedDateTime.of(datetime, ZoneId.of("Europe/London"));
		System.out.println("starttime: "+zdt);
		
		ZonedDateTime indiaTime=zdt.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		System.out.println("starttime: "+indiaTime);
		
		ZonedDateTime gmt=ZonedDateTime.of(datetime, ZoneId.of("GMT"));
		System.out.println("starttime: "+gmt);
		
		
		LocalDate birthDay=LocalDate.of(1962, Month.APRIL,23);
		LocalDate today=LocalDate.now();
		Period p=birthDay.until(today);
		System.out.println("Complete Age: "+p.toString());
		System.out.println("Age: "+p.getYears());
		System.out.println("Month: "+p.getMonths());
		System.out.println("Days: "+p.getDays());
		
		Instant startTime=Instant.now();
		//testLegacyDateAPI();
		Instant endTime=Instant.now();
		Duration timeElapsed=Duration.between(startTime, endTime);
		System.out.println("TimeElapsed in ms: "+timeElapsed.toMillis());
		
		//partial classes
		System.out.println("Christmas: "+MonthDay.of(Month.DECEMBER, 25));
	}
	public static void main(String[] args) {
		testLegacyDateAPI();
	}
	
}
