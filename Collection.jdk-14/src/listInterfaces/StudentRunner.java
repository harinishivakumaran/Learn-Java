package listInterfaces;
import java.util.*;

//ascending sorting 
//there is an overloaded method which accepts a implementation of another Comparator
class AscendingStudentComparator implements Comparator<Student>{
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StudentRunner {

	public static void main(String[] args) {
		List<Student> students=List.of(new Student(1,"Rini"),new Student(100,"Sow"),new Student(2,"Kas"));
		List<Student> studentsArr=new ArrayList<>(students);
		System.out.println(students);
		//Collections.sort(studentsArr);
		//sort shows compilation error since the inbuilt method (compareTo) for sort only sorts for Integer
		//so sort's method compareTo() must be override in the student class using implements Comparable<Student> 
		//where Comparable is an interface.
		Collections.sort(studentsArr); 
		System.out.println("Desc"+studentsArr);
		//Collections.sort(studentsArr, new AscendingStudentComparator());
		studentsArr.sort(new AscendingStudentComparator()); //another way
		System.out.println("Asc"+studentsArr);
		
		
	}

}


