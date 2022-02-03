package Intro;
import java.lang.*;
import java.math.BigDecimal;
import java.util.ArrayList;
//import java.util.Collections; since all the methods are static imported

//static imports
import static java.lang.System.out; 
import static java.util.Collections.*;

public class ImportRunner {

	public static void main(String[] args) {
		
		String str="";
		BigDecimal db=null;
		
		//System.out.println("Hello");
		out.println("Hello"); //System is static imported.
		
		//Collections.sort(new ArrayList<Integer>());
		sort(new ArrayList<Integer>());
	}

}
