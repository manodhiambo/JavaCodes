import java.util.Scanner; //program uses class scanner

public class Addition
{
	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum;

		System.out.print( "Ënter first interger: " );
		number1 = input.nextInt();

		System.out.print( "Enter second integer ");
		number2 = input.nextInt();

		sum = number1 + number2;

		System.out.printf( "Sum is %d\n", sum);

	}
}
