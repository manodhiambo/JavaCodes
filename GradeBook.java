// Class declaration with one method

public class GradeBook
{
	private String courseName;

	//constructor initializes courseName with String argument
	public GradeBook( String name)
	{
	
		courseName = name;
	} // end constructor

	//method to set the course name
	public void setCourseName( String name)
	{
	
		courseName = name; // stores the course name


	}// end method setCourseName
	
	//method to retrieve the course name
	public String getCourseName()
	{
	
		return courseName;
	} // end method  getCourseName
	

	// display a welcom message to the gradebook user
	public void displayMessage()
	{
	
		// calls getCourseMethod to get the name of the course
		// this GradeBook represents

		System.out.printf("Welcome to the Grade Book for \n %s!\n", getCourseName() );
	}
}
