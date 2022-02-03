package projectnew;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentAdmissionDAO {
	public boolean addStudentAdmissionDetails(List<StudentAdmission> studentAdmissionList) {
// TODO Auto-generated method stub
		boolean recordsAdded = false;
		int size = studentAdmissionList.size();
		DBConnectionManager dbConnectionManager = DBConnectionManager.getInstance();
		Connection con = dbConnectionManager.getConnection();
		String s1 = "insert into uno_admission values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try (PreparedStatement preparedStatement = con.prepareStatement(s1);) {
			int i = 0;
			for (StudentAdmission s : studentAdmissionList) {
				preparedStatement.setString(1, s.getAdmissionId());
				preparedStatement.setString(2, s.getStudentCode());
				preparedStatement.setDate(3, ApplicationUtil.convertUtilToSqlDate(s.getDateOfCounseling()));
				preparedStatement.setString(4, s.getDepartmentName());
				preparedStatement.setDate(5, ApplicationUtil.convertUtilToSqlDate(s.getDateOfAdmission()));
				preparedStatement.setString(6, s.getPreferCollegeHostel());
				preparedStatement.setString(7, s.getFirstGraduate());
				preparedStatement.setString(8, s.getManagerApproval());
				preparedStatement.setDouble(9, s.getAdmissionFee());
				preparedStatement.setDouble(10, s.getTuitionFee());
				preparedStatement.setDouble(11, s.getHostelFee());
				preparedStatement.setDouble(12, s.getTotalCollegeFee());
				preparedStatement.setString(13, s.getFinalStatusOfAdmission());
				preparedStatement.addBatch();
				i++;
				if (i == size) {
					preparedStatement.executeBatch();
				}
			}
		} catch (SQLException e) {
// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return recordsAdded;
	}

	public List<StudentAdmission> getAllStudentAdmissionDetails() throws StudentAdmissionException {
		List<StudentAdmission> stdAdmissions = new ArrayList<StudentAdmission>();
//code here
		DBConnectionManager dbConnectionManager = DBConnectionManager.getInstance();
		Connection con = dbConnectionManager.getConnection();
		String s = "select * from uno_admission";
		try {
			PreparedStatement statement = con.prepareStatement(s);
			ResultSet r = statement.executeQuery();
//resultSet.getString(1);
			while (r.next()) {
				String id = r.getString(1);
				String scode = r.getString(2);
				Date dcounsel = r.getDate(3);
				String dname = r.getString(4);
				Date doa = r.getDate(5);
				String pch = r.getString(6);
				String fg = r.getString(7);
				String ma = r.getString(8);
				double afee = r.getDouble(9);
				double tfee = r.getDouble(10);
				double hfee = r.getDouble(11);
				double ttfee = r.getDouble(12);
				String fsoa = r.getString(13);
				stdAdmissions.add(new StudentAdmission(id, scode, dcounsel, dname, doa, pch, fg, ma, afee, tfee, hfee,
						ttfee, fsoa));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return stdAdmissions;
	}
}