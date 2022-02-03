//inheritance using superclass -> Person and subclass-> Student
public class StudentRunner {

	public static void main(String[] args) {
		/*Student student=new Student();
		student.setName("Harini");
		student.setEmail("harini@thing.com");
		System.out.println(student); // output->Student@15db9742
		*/
		/*
		Person person=new Person();
		person.setName("Rini");
		person.setEmail("rini@gmail.com");
		person.setPhonenumber(80561);
		String value=person.toString();
		System.out.println(value); //output->Person@6d06d69c
		System.out.println(person); //person.toString() -> is automatically called.
		//output->Person@6d06d69c this is output when override not implemented.
		//this output is automatically generated from toString() method of the class object present in the person class.
		*/
		Employee employee=new Employee("Rini","Tester");
		//employee.setName("Rini");
		employee.setEmail("rini@gmail.com");
		employee.setPhonenumber(80561);
		employee.setEmployeeGrade('A');
		employee.setTitle("Tester");
		System.out.println(employee);
		
	}

}

