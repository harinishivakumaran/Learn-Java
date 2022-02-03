package advJavaConcepts;

import java.util.*;
import java.util.stream.Stream;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

    	Object[] e = Arrays.stream(details).map(d -> {
    		String[] v=d.split(";");
    		String eId=v[0];
    		String eName=v[1];
    		double sal=Double.parseDouble(v[2]);
    		Employee em=new Employee();
    		em.setEmpId(eId);
    		em.setEmpName(eName);
    		em.setSalary(sal);
    		return em;
    	}).toArray();
    	
    	Employee[] employee=Arrays.copyOf(e,e.length,Employee[].class);
		return employee;

	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		Stream<Employee> e = Arrays.stream(empDetails);
		return e;
	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {
		
		
	    Object[] o = empStream.filter(e -> e.getSalary() >= minSalary).sorted((a,b) -> a.getEmpId().compareTo(b.getEmpId())).
	    		map(e -> String.format("%s %s %.1f", e.getEmpId(),e.getEmpName(),e.getSalary())).toArray();
	    		
	    		
	    		
	    		
		String[] ss=Arrays.copyOf(o,o.length,String[].class);
		return ss;
	}

}
