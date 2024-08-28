import java.io.*;
class InputTest
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
		String strnum1;
		String strnum2;
		
		int num1;
		int num2;
		int sum;

		System.out.println("Enter the first number: ");
		strnum1 = input.readLine();
		num1 = Integer.parseInt(strnum1);

		System.out.println("Enter the second number: ");
		strnum2 = input.readLine();
		num2 = Integer.parseInt(strnum2);

		sum = num1 + num2;
		System.out.println("Sum ="+sum);
	}
}
