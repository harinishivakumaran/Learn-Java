import java.math.BigDecimal;

public class accurateDecimals {

	public static void main(String[] args) {
		//Note: BigDecimal inputs must be in form of strings.
		BigDecimal a=new BigDecimal("33.56332");// BigDecimal gives accurate values of the decimals after operations.
		BigDecimal b=new BigDecimal("33.662973");//BigDeciaml is an immutable class.
		System.out.print(a.add(b));
		//BigDecimal is not a primitive data type
		

	}

}
