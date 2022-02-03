import java.math.BigDecimal;
import java.util.*;
import java.math.RoundingMode;
public class Student {
	private ArrayList<Integer> marks=new ArrayList<Integer>();
	//private int[] marks;
	private String name;
	public Student(String name, int... marks) {
		this.name=name;
		//this.marks=marks;
		for(int i:marks) {
			this.marks.add(i);
		}
	}
	public int getNumberOfMarks() {
		return marks.size();
		//return marks.length;
	}
	public int getMaxMark() {
		return Collections.max(marks);
		//int max=Integer.MIN_VALUE;
		//for(int i:marks) {
			//if(max<i) {
				//max=i;
			//}
		//}
		//return max;
	}
	public int getMinMark() {
		return Collections.min(marks);//ArrayList is a part of Collections		
		//int min=Integer.MAX_VALUE;
		//for(int i:marks) {
			//if(min>i) {
				//min=i;
			//}
		//}
		//return min;
	}
	public BigDecimal getAverage() {
		int sum=totalSumOfMarks();
		int n=getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(n),3,RoundingMode.UP); //accurate value
	}
	public int totalSumOfMarks() {
		int s=0;
		for(int i:marks) {
			s+=i;
		}
		return s;
	}
	public String toString(){//method to return the entire values.
		return name + " "+ marks;
	}
	public void addMark(int i) {
		marks.add(i);
	}
	public void removeMarkAtIndex(int i) {
		marks.remove(i);
	}
	
}
