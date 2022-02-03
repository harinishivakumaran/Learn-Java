package javastreams;
import java.util.*;
import java.util.stream.Stream;
public class EmployeeUtility {
	public Employee[] getEmployeeDetails (String[] details) {
		Object[] ob = Arrays.stream(details).map(s->{
			String[] arr=s.split(";");
			String eid=arr[0];
			String ename=arr[1];
			double sal=Double.parseDouble(arr[2]);
			Employee e=new Employee();
			e.setEmpId(eid);
			e.setEmpName(ename);
			e.setSalary(sal);
			return e;
		}).toArray();
		return Arrays.copyOf(ob, ob.length,Employee[].class);
	}
	
	public Stream<Employee> getStreamOfEmployee (Employee[] empDetails){
		return Arrays.stream(empDetails);
	}
	
	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {
		Object[] ob = empStream.filter(e->e.getSalary()>=minSalary).
				map(e->String.format("%s %s %.1f", e.getEmpId(),e.getEmpName(),e.getSalary())).toArray();
		return Arrays.copyOf(ob, ob.length,String[].class);
	}
}
