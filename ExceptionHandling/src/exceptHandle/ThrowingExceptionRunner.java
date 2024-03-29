package exceptHandle;

class CurrenciesDonotMatchException extends Exception{ //throwing custom Exception
	public CurrenciesDonotMatchException(String msg) {
		super(msg);
	}
}

class Amount{
	private String currency;
	private int amount;
	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public void add(Amount other) throws CurrenciesDonotMatchException /*Exception*/ {
	//public void add(Amount other) throws RuntimeException { 
	//if RuntimeException is implemented here there's no need of extending Exceptions in the other classes and methods.
		if (!this.currency.equals(other.currency)) {
			throw new CurrenciesDonotMatchException("Currencies don't match "+this.currency+" and "+other.currency);
			//throw new Exception("Currencies don't match "+this.currency+" and "+other.currency);
			//checkedException
		}
		this.amount=this.amount+other.amount;
	}
	
	public String toString(){
		return amount+" "+currency;
	}
}
public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDonotMatchException {
		Amount amount1=new Amount("USD",75);
		Amount amount2=new Amount("EUR",50);
		amount1.add(amount2);
		System.out.println(amount1);
		
	}

}
