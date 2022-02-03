
public class MyChar {
	
	private char ch;
	
	public MyChar(char ch) {
		this.ch=ch;
		
	}

	public boolean isVowel() {
		if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='I' || ch=='E' || ch=='O' || ch=='U'  ) {
			return true;
		}
		return false;
	}

	public boolean isDigit() { // ascii value for '0' is 48 and for '9' is 57
		if(ch>=48 && ch<=57)	//between '0' and '9'	
			return true;
		return false;
	}

	public boolean isAlphabet() {
		if(ch>=97 && ch<=122) { // between 'a' and 'z'
			return true;
		}
		if(ch>=65 && ch<=90) { // between 'A' and 'Z'
			return true;
		}
		return false;
	}

	public boolean isConsonant() {
		if(isAlphabet() && !isVowel())
			return true;
		return false;
	}

	public static void printLowerCaseAlphabets() {
		//'a' to 'z'
		for(char ch='a';ch<='z';ch++) {
			System.out.print(ch+" ");
		}
	}

	public static void printUpperCaseAlphabets() {
		//'A' to 'Z'
		for(char ch='A';ch<='Z';ch++) {
			System.out.print(ch+" ");
		}
	}
	
	
}
