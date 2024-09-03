// Account class with a constructor to validate and initialize instance variable balance of type double


public class Account
{

	private double balance; // instance variable


	// constructor
	public Account( double initialBalance)
	{
	
		//validate that initialBalance is greater than 0.0;
		//if it is not, balance is initialized to the default value 0.0

		if ( initialBalance > 0.0)
			balance = initialBalance;
	} // end of account constructor
	
	// credit (add) an amount to the account
	public void credit( double amount)
	{
	
		balance = balance + amount;
	}

	// return the account balance
	public double getBalance()
	{
	
		return balance;
	}
}
