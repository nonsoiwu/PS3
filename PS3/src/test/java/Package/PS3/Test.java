package Package.PS3;
import Package.PS3.Account;

public class Test {

	public static void main(String[] args) {
		
		Account mockAccount = new Account();
		mockAccount.setID(1122);
		mockAccount.setBalance(20000);
		mockAccount.setAnnualInterestRate(4.5);
		
		mockAccount.withdraw(2500);
		mockAccount.deposit(3000);
		
		System.out.print("The balance is $" + mockAccount.getBalance() + ".\n" + 
		"The per month interest is " + mockAccount.getMonthlyInterest() + ".\n" + 
		"The account was created on " + mockAccount.getDateCreated());
	}
}
