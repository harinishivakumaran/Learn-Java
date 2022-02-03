package DC;
//13.10.2020
import java.util.*;
public class DirectionandMinimumShift {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    String str1=sc.nextLine(); //icecream
	    String str2=sc.nextLine(); //reamicec
	    String leftRot=str1,rightRot=str1;
	    if(str1.equals(str2)){
	        System.out.print("A0");
	        System.exit(0);
	    }
	    for(int ctr=1;ctr<=str1.length();ctr++){
	        leftRot=leftRot.substring(1)+leftRot.charAt(0);
	        //System.out.println(leftRot);
	        rightRot=rightRot.charAt(str1.length()-1)+rightRot.substring(0,str1.length()-1);
	        //System.out.println(rightRot);
	        if(leftRot.equals(str2) && rightRot.equals(str2)){
	            System.out.print("A"+""+ctr);
	            break;
	        }
	        else if(leftRot.equals(str2)){
	            System.out.print("L"+""+ctr);
	            break;
	        }
	        else if(rightRot.equals(str2)){
	            System.out.print("R"+""+ctr);
	            break;
	        }
	    }
	    sc.close();
	}

}
