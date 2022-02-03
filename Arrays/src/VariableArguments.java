
public class VariableArguments {
	//method using variable arguments.
	private static int sum(int... values) { //accept multiple arguments.
		int s=0;
		for(int i:values) {
			s+=i;
		}
		return s;
	}
	
	public static void main(String[] args) {
		System.out.println(sum(1,4,76));
	}

}
