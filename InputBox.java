import javax.swing.JOptionPane;
public class InputBox
{

	public static void main(String[] args)
	{
		String fnum, snum;
		int num1, num2, sum;

		// Get the first number from user input
		fnum = JOptionPane.showInputDialog("Enter the first number");

		// Get the second number from user input
		snum = JOptionPane.showInputDialog("Enter the second number");

		// Convert the input strings to integers
		num1 = Integer.parseInt(fnum);
		num2 = Integer.parseInt(snum);

		// Calculate the sum
		sum = num1 + num2;

		 // Display the result
		 JOptionPane.showMessageDialog(null, "The sum is: " + sum, "Addition Results", JOptionPane.PLAIN_MESSAGE);
		 // Exit the program
		 System.exit(0);
	}
}
// import javax.swing.JOptionPane – include the class needed to support the function showInputDialog.
// String fnum, snum; -declare the variables of type string to capture using keyboard.
// NB: all keyboard values are captured as string in Java then vonverted to other types using conversion
// functions
// •int num1, num2, sum; - declare equivalent integer variables for fnum AND snum. They will hold the
// converted values.
