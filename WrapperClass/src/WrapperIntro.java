
public class WrapperIntro {
	public static void main(String[] args) {
		Float f=Float.valueOf(57.34f);
		int i=f.intValue();
		System.out.println(i); //57
		Integer s=Integer.valueOf("111",2); //7 converts binary to decimal
		System.out.println(s); 
		System.out.println(Integer.toString(s,2)); // 111 decimal -> binary
	}
}
