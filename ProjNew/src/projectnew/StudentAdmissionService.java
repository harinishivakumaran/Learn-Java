package projectnew;

import java.sql.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class StudentAdmissionService {
	public static List<StudentAdmission> buildStudentAdmissionsList(List<String> studentAdmissionRecords)
			throws ParseException {
		List<StudentAdmission> studentAdmissionList = new ArrayList<StudentAdmission>();
//code here
		double[] values = new double[4];
		for (String s : studentAdmissionRecords) {
			String sss[] = s.split(",");
			values = calculateTotalCollegeFee(sss[5], sss[6], sss[3]);
			studentAdmissionList.add(new StudentAdmission(sss[0], sss[1], ApplicationUtil.convertStringToDate(sss[2]),
					sss[3], ApplicationUtil.convertStringToDate(sss[4]), sss[5], sss[6], sss[7], values[0], values[1],
					values[2], values[3], "AdmissionSuccessfull"));
		}
		return studentAdmissionList;
	}

	public static double[] calculateTotalCollegeFee(String preferCollegeHostel, String firstGraduate,
			String departmentName) {
		double[] studentAdmissionCosts = new double[4];
//Code here..
		double admission_fee = 30000;
		double tutionfess = 0;
		double hostelfess = 0;
		double first = 0;
		if (departmentName.equalsIgnoreCase("eee") || departmentName.equalsIgnoreCase("cse")
				|| departmentName.equalsIgnoreCase("it") || departmentName.equalsIgnoreCase("ece")
				|| departmentName.equalsIgnoreCase("civil") || departmentName.equalsIgnoreCase("mech")) {
			studentAdmissionCosts[0] = admission_fee;
			if (departmentName.equalsIgnoreCase("eee") || departmentName.equalsIgnoreCase("cse")
					|| departmentName.equalsIgnoreCase("it")) {
				tutionfess = 45000;
				studentAdmissionCosts[1] = tutionfess;
			}
			if (departmentName.equalsIgnoreCase("ece") || departmentName.equalsIgnoreCase("civil")) {
				tutionfess = 50000;
				studentAdmissionCosts[1] = tutionfess;
			}
			if (departmentName.equalsIgnoreCase("mech")) {
				tutionfess = 55000;
				studentAdmissionCosts[1] = tutionfess;
			}
			if (preferCollegeHostel.equalsIgnoreCase("yes")) {
				hostelfess = 75000;
				studentAdmissionCosts[2] = hostelfess;
			}
			if (firstGraduate.equalsIgnoreCase("yes")) {
				first = 20000;
			}
		}
		studentAdmissionCosts[3] = studentAdmissionCosts[0] + studentAdmissionCosts[1] + studentAdmissionCosts[2]
				- first;
		return studentAdmissionCosts;
	}

	public boolean addStudentAdmissionDetails(String inputFeed) throws StudentAdmissionException {
//Code here
		List<String> ss = ApplicationUtil.readFile(inputFeed);
		List<StudentAdmission> studentAdmissionList = null;
		try {
			studentAdmissionList = buildStudentAdmissionsList(ss);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		StudentAdmissionDAO studentAdmissionDAO = new StudentAdmissionDAO();
		studentAdmissionDAO.addStudentAdmissionDetails(studentAdmissionList);
		return false;
	}

	public boolean searchStudentAdmission(String admissionId) throws StudentAdmissionException {
		boolean status = false;
//Code here..
		DBConnectionManager dbConnectionManager = DBConnectionManager.getInstance();
		Connection con = dbConnectionManager.getConnection();
		try {
			StudentAdmission ss123 = null;
			Statement ss = con.createStatement();
			String s = "select * from uno_admission where admissionId=?";
			PreparedStatement preparedStatement = con.prepareStatement(s);
			preparedStatement.setString(1, admissionId);
			ResultSet r = preparedStatement.executeQuery();
			while (r.next()) {
				ss123 = new StudentAdmission(r.getString(1), r.getString(2), r.getDate(3), r.getString(4), r.getDate(5),
						r.getString(6), r.getString(7), r.getString(8), r.getDouble(9), r.getDouble(10),
						r.getDouble(11), r.getDouble(12), r.getString(13));
				status = true;
			}
		} catch (SQLException throwables) {
			throwables.printStackTrace();
		}
		return status;
	}
}