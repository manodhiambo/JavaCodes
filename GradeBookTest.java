// Creating a gradeBook object and calling its displayMessage method

public class GradeBookTest
{

	public static void main( String[] args)
	{
		// create GradeBook object
		GradeBook gradeBook1 = new GradeBook(
				"BIT Introduction to Java Programming");
		GradeBook gradeBook2 = new GradeBook(
				"BIT Data structures in Java");
	

		//display initial value of courseName
		System.out.printf( "gradeBook1 course name is: %s \n\n", gradeBook1.getCourseName());

		System.out.printf("gradeBook2 courseName is:  %s\n", gradeBook2.getCourseName());
	}
}
