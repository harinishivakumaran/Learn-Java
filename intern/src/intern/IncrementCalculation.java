package intern;
import java.util.*;

public class IncrementCalculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salary");
		int salary=sc.nextInt();
		int ap = 0;
		System.out.println("Enter the Performance appraisal rating");
		int rating=sc.nextInt();
		if (salary<=0 || !(rating>1 && rating<5)) {
			System.out.println("Invalid Input");
			System.exit(0);
		}
		if(salary>1&&salary<3) {
			ap=(int) (salary*1.1);
		}else if(salary>3&&salary<4) {
			ap=(int) (salary*1.25);
		}else if(salary>4 && salary<5) {
			ap=(int) (salary*1.3);
		}
		System.out.println(ap);
	}

}
