package maven.Test;

public class FirstDemo {
	public int add(int a,int b) {
		return a+b;
	}
	public static void main(String[] args) {
		FirstDemo sum=new FirstDemo();
		System.out.println(sum.add(5, 3));
	}
}
