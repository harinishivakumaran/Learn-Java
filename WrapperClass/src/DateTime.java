import java.time.*;
//import java.util.ArrayList;
//import java.util.List;
public class DateTime {

	public static void main(String[] args) {
		LocalDate yesterday=LocalDate.of(2020, 8, 04); //creating instance
		System.out.println(yesterday);
		System.out.println(yesterday.withYear(2019));
		System.out.println(yesterday.withDayOfMonth(31));
		System.out.println(yesterday.withDayOfYear(67));
		System.out.println(yesterday.withMonth(5));
		LocalDate today=LocalDate.now();
		System.out.println(today.isAfter(yesterday));
		System.out.println(today.isBefore(yesterday));
		//List list=new ArrayList();
	}

}
