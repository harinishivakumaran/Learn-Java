package adcoops;

public class Account {
	private int accountId;
	private String accountType;
	private int balance;
	
	public void setAccountId(int accountId) {
		this.accountId=accountId;
	}
	public int getAccountId() {
		return accountId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	 public boolean withdraw(int amount) {
		 int bal=getBalance();
		 if(amount>bal) {
			 System.out.println("\"Sorry!!! No enough balance");
			 return false;
		 }else {
			 int cbal=bal-amount;
			 setBalance(cbal);
			 System.out.println("Balance amount after withdraw:"+cbal);
			 return true;
		 }
	 }
}
