
public class IntegerWrapper {

	public static void main(String[] args) {
		Integer i1=new Integer(5);//constructor
		Integer i2=new Integer(5);
		System.out.println(i1==i2); //false since it compares the memory locations of the values and not the values.
		Integer i3=Integer.valueOf(5);//another method: this method is recommended.
		Integer i4=Integer.valueOf(5);
		System.out.println(i3==i4); //true since it compares only values. Existing wrapper classes are reused.
		Integer i5=3; //auto-boxing feature: java in the background automatically takes the valueOf operation 
		System.out.println(i5);//this auto-boxing feature is used to add integer data types to collections (syntactical sugar).
		Integer i6=3;
		System.out.println(i6);
		System.out.println(i5==i6); //same as valueOfmethod
		System.out.println(Integer.MAX_VALUE); //2147483647
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.SIZE); //32 (bits)
		System.out.println(Integer.BYTES); //4 (bytes)
		//the above types are found in all type of wrapper classes.
	}

}
