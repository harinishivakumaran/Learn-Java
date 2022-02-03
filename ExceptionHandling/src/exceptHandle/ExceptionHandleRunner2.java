package exceptHandle;

public class ExceptionHandleRunner2 {

	public static void main(String[] args) {
		method1();
		System.out.println("Main Done");
	}

	private static void method1() {
		method2();
		System.out.println("Method1 Done");
	}

	private static void method2() {
		try{
			//String s=null;
			//s.length();
			int[] a= {1,2};
			int b=a[3]; //ArrayIndexOutOfBoundsException
			System.out.println("Method2 Done");
		}catch(NullPointerException e){//another catch can also be given
			System.out.println("Exception handled");
		}catch(ArrayIndexOutOfBoundsException exc) {
			System.out.println("ArrayIndexOutOfBoundary");
		}
		catch(Exception ex) { //Exception is common for all type of thrown exceptions.
			//ex.printStackTrace();
			System.out.println("Done");
		}
	}
}
