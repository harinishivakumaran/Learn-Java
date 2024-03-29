import java.util.*;

public class SwitchExerciseRunne {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(getNameOfTheDay(n));
		System.out.println(isWeekDay(n));
		sc.close();
	}

	private static boolean isWeekDay(int n) {
		switch(n) {
		//case 0:
		//case 6:return false;
		case 2: 
		case 3: 
		case 4: 
		case 5: 
		case 1: return true; //if same returns apply for case~ can combine these like this.
		}
		return false;
	}

	private static String getNameOfTheDay(int a) {
		switch(a) {
		case 0: 
			return "Sunday";
		case 1: 
			return "Monday";
		case 2: 
			return "Tuesday";
		case 3: 
			return "Wednesday";
		case 4: 
			return "Thursday";
		case 5: 
			return "Friday";
		case 6: 
			return "Saturday";
		}
		return "Invalid";
	}

}
