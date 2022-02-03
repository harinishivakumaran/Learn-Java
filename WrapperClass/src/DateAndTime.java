import java.time.*; //while using in jshell import this package.
public class DateAndTime {

	public static void main(String[] args) {
		LocalDate now=LocalDate.now(); //this is standard constructor //immutable class
		System.out.println(now);
		LocalDateTime now1=LocalDateTime.now(); //this is standard constructor
		System.out.println(now1);
		LocalTime now2=LocalTime.now(); //this is standard constructor
		System.out.println(now2);
		System.out.println(now.getDayOfYear());
		System.out.println(now.getDayOfMonth());
		System.out.println(now.getDayOfWeek());
		System.out.println(now.getMonthValue());
		System.out.println(now.getMonth());
		System.out.println(now.getYear());
		System.out.println(now.isLeapYear());
		System.out.println(now.lengthOfYear());
		System.out.println(now.lengthOfMonth());
		System.out.println(now.plusDays(40));
		System.out.println(now.plusMonths(3));
		System.out.println(now.plusWeeks(24));
		System.out.println(now.plusYears(2));
		System.out.println(now.minusDays(60));
		System.out.println(now.minusYears(5));
		System.out.println(now2.plusSeconds(800));

	}

}
