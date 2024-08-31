// Creating a gradeBook object and calling its displayMessage method

import java.util.Scanner;
public class GradeBookTest
{

	public static void main( String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		GradeBook myGradeBook = new GradeBook();

		//display initial value of courseName
		System.out.printf( "Initial value name is: %s \n\n", myGradeBook.getCourseName());

		//prompt for and read course name
		System.out.println("Please enter the course name");
		String theName = input.nextLine();
		myGradeBook.setCourseName( theName);
		System.out.println();

		myGradeBook.displayMessage();
	}
}
