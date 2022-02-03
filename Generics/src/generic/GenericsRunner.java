package generic;

public class GenericsRunner {
	
	public static void main(String[] args) {
		
		MyCustomList<String> c=new MyCustomList<>();
		c.addElement("Element 1");
		c.addElement("Element 2");
		String value=c.get(0);
		System.out.println(c+" "+value);
		
		MyCustomList<Integer> c1=new MyCustomList<>();
		c1.addElement(Integer.valueOf(5));
		c1.addElement(Integer.valueOf(7));
		Integer value1=c1.get(0);
		System.out.println(c1+" "+value1);
		
		
	}

}
