
public class stringCompare {

	public static void main(String[] args) {
		String s1="GuruCharan";
		String s2="Charan";
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==s2.charAt(0)) {
				System.out.println(i+1);
			}
		}
	}

}
