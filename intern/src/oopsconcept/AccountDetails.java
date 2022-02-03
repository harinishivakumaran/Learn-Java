package oopsconcept;

import java.util.*;
public class AccountDetails {
	
	public static Account getAccountDetails() {
		Account acc=new Account();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account id:");
		int accId=sc.nextInt();
		acc.setAccountId(accId);
		System.out.println("Enter account type:");
		String acctype=sc.next();
		acc.setAccountType(acctype);
		int bal;
		while(true) {
			System.out.println("Enter balance:");
			bal=sc.nextInt();
			if(bal<=0) {
				System.out.println("Balance should be positive");
			}else {
				acc.setBalance(bal);
				break;
			}
		}
		return acc;
	}
	
	public static int getWithdrawAmount() {
		Scanner sc=new Scanner(System.in);
		
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
