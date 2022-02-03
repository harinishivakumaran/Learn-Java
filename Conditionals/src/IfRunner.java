
public class IfRunner {
	
	public static void main(String[] args) {
		puzzle1();
		puzzle2();
	}

	private static void puzzle2() {
		int f=20;
		if(f>10) {
			System.out.println(2);
		}
		if(f>30) {
			System.out.println(5);
		}
		else {
			System.out.println("HE");//this else is only for the 2nd if condition that becomes false and this else is executed.
		}
	}

	private static void puzzle1() {
		int k=20;
		if(k>10) {
			System.out.println("k in greater than 10");// if one case is true it does not check the other blocks;
		}
		else if(k<40) {
			System.out.println("k in lesser than 40");
		}
		else if(k>15) {
			System.out.println("k in greater than 15");
		}
	}
	
	//to avoid confusions always use block {} makes the code easily understandable
	
}
