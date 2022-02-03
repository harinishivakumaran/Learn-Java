package projectnew;

import java.util.ArrayList;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class ApplicationUtil {
	public static List<String> readFile(String fileName) throws StudentAdmissionException {
		List<String> studentAdmissionList = new ArrayList<String>();
		try {
			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
			String s;
			while ((s = bufferedReader.readLine()) != null) {
				if (s.contains("Approved")) {
					String s1[] = s.split(",");
					Date d1 = convertStringToDate(s1[2]);
					Date d2 = convertStringToDate(s1[4]);
					boolean b = checkIfValidAdmission(d1, d2, s1[7]);
					if (b) {
						studentAdmissionList.add(s);
					}
				}
			}
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception pe) {
			pe.printStackTrace();
		}
		return studentAdmissionList;
	}

	public static java.sql.Date convertUtilToSqlDate(java.util.Date uDate) {
		java.sql.Date sDate = null;
		sDate = new java.sql.Date(uDate.getTime());
		return sDate;
	}

	public static Date convertStringToDate(String inDate) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		try {
			return dateFormat.parse(inDate);
		} catch (ParseException pe) {
			return null;
		}
	}

	public static boolean checkIfValidAdmission(Date dtOfCounseling, Date dtOfAdmission, String manager)
			throws ParseException {
		boolean admissionValidity = false;
//Code here..
		try {
			Date counsel = dtOfCounseling;
			Date Admission = dtOfAdmission;
			long timediff = Admission.getTime() - counsel.getTime();
			long daydiff = ((timediff / (1000 * 60 * 60 * 24)) % 365);
			if (daydiff <= 10)
				admissionValidity = true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return admissionValidity;
	}
}