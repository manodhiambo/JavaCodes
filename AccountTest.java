// Inputting and Outputting floating point numbers with account object

import java.util.Scanner;

public class AccountTest
{

	public static void main( String[] args)
	{
	
		Account account1 = new Account( 60.00); // craete account object

		Account account2 = new Account( -7.53);

		// display initial balance of each object
		System.out.printf("Account balance: $%f\n",account1.getBalance());
		System.out.printf("Account2 balance: $%f", account2.getBalance());

		//create scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		double depositAmount;

		System.out.print("Enter deposit amount for Account1: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to Account1 balance \n\n", depositAmount);
		account1.credit(depositAmount);

		// display balance
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("\nadding %.2f to account2 balance \n\n", depositAmount);
		account2.credit( depositAmount);

		//display balances
		System.out.printf("account1 balance: $%.2f\n",account1.getBalance());
		System.out.printf("account2 balance: $%.2f\n",account2.getBalance());

	}
}
