package adcoops;
import java.util.*;
public class AccountDetails {
	static Scanner sc=new Scanner(System.in);
	public static Account getAccountDetails() {
		Account acc=new Account();
		System.out.println("Enter account id:");
		int accountId=sc.nextInt();
		acc.setAccountId(accountId);
		System.out.println("Enter account type:");
		String accountType=sc.next();
		acc.setAccountType(accountType);
		System.out.println("Enter balance:");
		int balance=sc.nextInt();
		acc.setBalance(balance);
		return acc;
	}
	public static int getWithdrawAmount() {
		Account acc=new Account();
		int amt;
		while(true) {
			System.out.println("Enter amount to be withdrawn:");
			amt=sc.nextInt();
			if(amt<=0) {
				System.out.println("Amount should be positive");
			}else {
				break;
			}
		}
		return amt; 
	}
	public static void main(String[] args) {
		Account account=new Account();
		account=getAccountDetails();
		int wamt=getWithdrawAmount();
		account.withdraw(wamt);
	}

}