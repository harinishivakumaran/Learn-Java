package Intro;

import java.util.Arrays;

enum Season{
	//here Season is a class and winter, summer, fall, spring are object of this class
	//the objects are implicitly public static final
	WINTER(1), SUMMER(2), FALL(3), SPRING(4);
	//assigning values and access from database
	//values do not change irrespective of the position
	
	private int value;
	
	private Season(int value) {
		this.value=value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	//ordinal - 0,1,2,3... position
}

public class EnumRunner {

	public static void main(String[] args) {
		
		//Season season="Fall"; not possible
		
		Season season=Season.FALL;
		System.out.println(season);
		Season s1=Season.valueOf("WINTER");
		System.out.println(s1);
		System.out.println(s1.name());
		System.out.println(s1.ordinal());
		System.out.println(season.ordinal());
		System.out.println(Season.SPRING.ordinal());
		
		System.out.println(Arrays.toString(Season.values())); //[WINTER, SUMMER, FALL, SPRING]
		
		System.out.println(Season.SPRING.getValue()); 
		//value do not change irresptive of the position
		
		Season[] s=Season.values();
		for(Season r:s) {
			System.out.println(r.ordinal()+" "+r);
		}
	}

}
