import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		//int marks[]= {78,98,75,69,76,88,56};
		//Student student=new Student("Harini",marks);
		//Student student = new Student ("Harini",new int[] {78,98,75,69,76,88,56});
		//applicable to all data types.
		//this is refactor method -> direct initialization without any arguments.
		Student student = new Student ("Harini",78,98,75,69,76,88,56); //variable arguments parameter must be the last parameter.
		//the above statement is used while implementing a variable argument.
		int number=student.getNumberOfMarks();
		System.out.println(number);
		int sum=student.totalSumOfMarks();
		System.out.println(sum);
		int maxMark=student.getMaxMark();
		int minMark=student.getMinMark();
		BigDecimal average=student.getAverage();
		System.out.println(maxMark+" "+minMark+" "+average);
		System.out.println(student);
		student.addMark(44);
		System.out.println(student);
		student.removeMarkAtIndex(3);
		System.out.println(student);
	}

}
