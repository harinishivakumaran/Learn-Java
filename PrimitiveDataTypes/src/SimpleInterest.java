import java.math.BigDecimal;

public class SimpleInterest {

	BigDecimal p;
	BigDecimal in;
	
	public SimpleInterest(String p, String in) {
		this.p=new BigDecimal(p);
		this.in=new BigDecimal(in).divide(new BigDecimal(100));		
	}

	public BigDecimal calculateTotalValue(int n) {
		//totalValue= p + p * in * n;
		BigDecimal totalValue = p.add(p.multiply(in).multiply(new BigDecimal(n)));//since n in an int it's converted to BigDecimal to perform the operation.
		return totalValue;
	}

}
