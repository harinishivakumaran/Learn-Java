import java.math.BigDecimal;

public class SimpleInterestRunner {

	public static void main(String[] args) {
		SimpleInterest a=new SimpleInterest("4550.00", "8.5");
		BigDecimal b=a.calculateTotalValue(6);
		System.out.println(b);

	}

}
