package newdemoproj;

public class StringReversal {
	private static String Reversal(String str) {
		String r="";
		for(int i=str.length()-1;i>=0;i--) {
			r+=str.charAt(i);
		}
		return r;
	}
	private static String SameStringReversal(String str) {
		char[] s=str.toCharArray();
		int n=str.length();
		for(int i=0;i<n/2;i++) {
			char ch=s[i];
			s[i]=s[n-i-1];
			s[n-i-1]=ch;
		}
		return String.valueOf(s);
	}
	public static void main(String[] args) {
		StringReversal sr=new StringReversal();
		System.out.println(Reversal("Harini"));
		System.out.println(SameStringReversal("Sowbha")); 
		
	}
}
