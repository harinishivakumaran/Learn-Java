
public class MyCharRunner {

	public static void main(String[] args) {
		MyChar c=new MyChar('D');
		System.out.println(c.isVowel());
		System.out.println(c.isConsonant());
		System.out.println(c.isDigit());
		System.out.println(c.isAlphabet());
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
		
	}
}
