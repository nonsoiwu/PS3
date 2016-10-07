package Package.PS3;
import java.util.Date;

public class Account {
	
	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new java.util.Date();
	
	public Account(){
	}
	
	public Account(int id, double initbalance){
		this.id = id;
		this.balance = initbalance;
		this.dateCreated = new Date();
	}
	
	public int getID(){
		return id;
	}
	
	public void setID(int id){
		this.id = id;
	}
	
	public double getBalance(){
		return balance;
	}
	
	public void setBalance(double Balance){
		this.balance = Balance;
	}
	
	public double getannualInterestRate(){
		return annualInterestRate;
	}
	
	public void setAnnualInterestRate(double annualInterestRate){
		this.annualInterestRate = annualInterestRate;
	}
	
	public Date getDateCreated(){
		return dateCreated;
	}
	
	public double getMonthlyInterest(){
		return (annualInterestRate / 12);
	}
	
	public void withdraw(double amount){
		balance = balance - amount;
	}
	
	public void deposit(double amount){
		balance += amount;
	}
}
