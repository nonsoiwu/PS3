package Package.PS3;
@SuppressWarnings("Serial")

public class InsufficientFundsException extends Exception{
	private double amount;
	
	public InsufficientFundsException(double amount){
		this.amount = amount;
	}
	
	public double getAmount(){
		return amount;
	}

}
