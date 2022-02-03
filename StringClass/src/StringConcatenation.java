
public class StringConcatenation {


	public static void main(String[] args) {
		System.out.println("1"+2+3); //123
		System.out.println(1+2+"3"); //33
		System.out.println("1"+23); //123 
		System.out.println("1"+2); //12
		System.out.println(String.join(",", "2","r","$")); //"2,r,$" first element is supposed to be present between the remaining elements.
		System.out.println(String.join("*", "2","r","$")); //"2*r*$" first element is the joining of other elements.
		System.out.println("abcdef".replace("cde", "yzs")); // "abcdef" -> "abyzsf"
	}

}
