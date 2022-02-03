
public class StringClassRunner {

	public static void main(String[] args) {
		String s="This is a lot of text!";
		String r="hello";
		System.out.println(s.length());
		System.out.println(s.contains("is"));
		System.out.println(s.indexOf('a'));
		System.out.println(s.lastIndexOf('e'));
		System.out.println(s.charAt(10));
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
		System.out.println(s.startsWith("This"));
		System.out.println(s.startsWith("is"));
		System.out.println(s.endsWith("This"));
		System.out.println(s.endsWith("text!"));
		System.out.println(s.isEmpty());
		System.out.println("".isEmpty());
		System.out.println(r.equals("hello"));//case-sensitive
		System.out.println(r.equalsIgnoreCase("HeLlo"));//not case-sensitive
		
	}

}
