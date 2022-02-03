
public class StringFunctions {

	public static void main(String[] args) {
		String s="Java";
		s.concat("Learning");
		System.out.println(s); //since string is immutable the s string cannot be modified 
		String r=s.concat(" Learning");
		System.out.println(r);
		System.out.println(s); //not modified.
		String l=r.concat(".");
		System.out.println(l);
		String h=" good morning ";//trims only start and end spaces.
		System.out.println(h.trim());
		System.out.println(r.toUpperCase());
		System.out.println(r.toLowerCase());
		
	}

}
