package projectnew;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class MainApp {
	public static void main(String[] args) throws StudentAdmissionException {
// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentAdmissionService studentAdmissionService = new StudentAdmissionService();
		try {
			studentAdmissionService.addStudentAdmissionDetails("./Lib/inputFeed.txt");
		} catch (StudentAdmissionException e) {
			e.printStackTrace();
		}
		StudentAdmissionDAO studentAdmissionDAO = new StudentAdmissionDAO();
		List<StudentAdmission> stdAdmissions = new ArrayList<StudentAdmission>();
		stdAdmissions = studentAdmissionDAO.getAllStudentAdmissionDetails();
		boolean b = studentAdmissionService.searchStudentAdmission("A005");
		if (b) {
			System.out.println("Student admission found");
		} else {
			System.out.println("Student admission not found");
		}
		sc.close();
	}
}