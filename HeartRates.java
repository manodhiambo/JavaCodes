//Target Heart Rate calculator
//While exercising, you can use a heart-rate monitor to see
//that your heart rate stays within a safe range suggested by your trainers and doctors.
//The formula for calculating your maximum heart rate in beats per minute is 220 minus your age in
//years. Your target heart rate is a range that’s 50–85% of your maximum heart rate.
// Maximum and target heart rates may vary based on the
// health, fitness and gender of the individual.
//This is Java application that prompts for the person’s information, instantiates an object
//of class HeartRates and prints the information from that object—including the person’s first name,
//last name and date of birth—then calculates and prints the person’s age in (years), maximum heart
//rate and target-heart-rate range.


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HeartRates
{

	private String firstName;
	private String lastName;
	private int birthMonth;
	private int birthDay;
	private int birthYear;

	// constructor with parameters
	 public HeartRates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear)
	 {
	 
		 this.firstName = firstName;
		 this.lastName = lastName;
		 this.birthMonth = birthMonth;
		 this.birthDay = birthDay;
		 this.birthYear = birthYear;
	 }

	// main program
	public static void main(String[] args )
	{
	
		Scanner scanner = new Scanner(System.in);

		//Prompt for user's information
		System.out.print("Enter firstName: ");
		String firstName = scanner.nextLine();

		System.out.print("Enter last name: ");
		String lastName = scanner.nextLine();

		System.out.print("Enter birth month(1-12): ");
		int birthMonth = scanner.nextInt();

		System.out.print("Enter birth day(1-31): ");
		int birthDay = scanner.nextInt();

		System.out.print("Enter birth year: ");
		int birthYear = scanner.nextInt();

		//create a Heartrates object
		HeartRates heartRates = new HeartRates(firstName, lastName, birthMonth, birthDay, birthYear);

		//Display the person's information
		System.out.println("\n--- Heart Rate Information ---");
		System.out.println("Name: " + heartRates.getFirstName() + " " + heartRates.getLastName());
		System.out.println("Date of Birth: " + heartRates.getBirthMonth() + "/" + heartRates.getBirthDay() + "/" + heartRates.getBirthYear());
		System.out.println("Age: " + heartRates.getAge() + " years");
		System.out.println("Maximum Heart Rate: " + heartRates.getMaxHeartRate() + " bpm");
		System.out.println("Target Heart Rate Range: " + heartRates.getTargetHeartRate());

	}



	//constructor
	public void Heartrates(String firstName, String lastName, int birthMonth, int birthDay, int birthYear)
	{
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
	}

	// setters
	public void setFirstName( String firstName)
	{
	
		this.firstName = firstName;
	}
	public void setLastName(String lastName)
	{
	
		this.lastName = lastName;
	}
	public void setBirthMonth(int birthMonth)
	{
	
		this.birthMonth = birthMonth;
	}
	public void setBirthDay(int birthDay)
	{
	
		this.birthDay = birthDay;
	}
	public void setBirthYear(int birthYear)
	{
	
		this.birthYear = birthYear;
	}


	// Getters
	public String getFirstName()
       	{return firstName;}
	public String getLastName()
	{return lastName;}
	public int getBirthMonth() 
	{ return birthMonth;}
	public int getBirthDay() 
	{ return birthDay;}
	public int getBirthYear() 
	{ return birthYear;}

	//Method to calculate the person's age in year
	public int getAge() 
	{
	
		LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
		return Period.between(birthDate, LocalDate.now()).getYears();
	}

	//Method to calculate the person's maximum heart rate
	public int getMaxHeartRate()
	{
		
		return 220 - getAge();
	}

	// Method to calculate the person's target heart rate range
	public String getTargetHeartRate()
	{
		
		int maxHeartRate = getMaxHeartRate();
		int lowerBound = (int) (maxHeartRate * 0.50);
		int upperBound = (int) (maxHeartRate * 0.85);
		return lowerBound + " - " + upperBound + " bpm";
	}
}
