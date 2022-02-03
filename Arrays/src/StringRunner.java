
public class StringRunner {

	public static void main(String[] args) {
		String[] days= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		String dayWithMostCharacters="";
		for(String d:days) {
			if (d.length()>dayWithMostCharacters.length()) {
				dayWithMostCharacters=d;
			}
		}
		System.out.println(dayWithMostCharacters);
		for(int i=days.length-1;i>=0;i--) {
			System.out.print(days[i]+" ");
		}
	}

}
