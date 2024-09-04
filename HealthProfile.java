// Computerizing health records could make it easier for patients to share their health profiles and histories among their various health care professionals. This could improve the quality of health care,
// help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
// save lives.
// Here, you’ll design a “starter” HealthProfile class for a person.
// The attributes should contain the person’s first name, last name, gender, date of birth (consisting of separate
// attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
// should have a constructor that receives this data. For each attribute, provide set and get methods.
// Write a Java application that prompts for the person’s information, instantiates an
// object of class HealthProfile for that person and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and
// prints the person’s age in years, BMI, maximum heart rate and target-heart-rate range.


import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class HealthProfile
{

	private String firstName;
	private String lastName;
	private String gender;
	private int birthMonth;
	private int birthDay;
	private int birthYear;
	private int heightInInches;
	private int weightInPounds;

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		//Prompting user for information
		System.out.print("Enter first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter gender: ");
		String gender = input.nextLine();

		System.out.print("Enter birth month (1-12): ");
		int birthMonth = input.nextInt();

		System.out.print("Enter birth day (1-31): ");
		int birthDay = input.nextInt();

		System.out.print("Enter birth year: ");
		int birthYear = input.nextInt();

		System.out.print("Enter height in inches: ");
		int heightInInches = input.nextInt();

		System.out.print("Enter weight in pounds: ");
		int weightInPounds = input.nextInt();

		// Create HealthProfile objec
		HealthProfile person = new HealthProfile(firstName, lastName, gender, birthMonth, birthDay, birthYear, heightInInches, weightInPounds);

		// Display the information
		System.out.println("\nHealth Profile Information:");
		System.out.println("Name: " + person.getFirstName() + " " + person.getLastName());
		System.out.println("Gender: " + person.getGender());
		System.out.println("Date of Birth: " + person.getBirthMonth() + "/" + person.getBirthDay() + "/" + person.getBirthYear());
		System.out.println("Height: " + person.getHeightInInches() + " inches");
		System.out.println("Weight: " + person.getWeightInPounds() + " pounds");
		System.out.println("Age: " + person.getAge() + " years");
		System.out.println("BMI: " + String.format("%.2f", person.getBMI()));
		System.out.println("Max Heart Rate: " + person.getMaxHeartRate() + " beats per minute");
		System.out.println("Target Heart Rate Range: " + person.getTargetHeartRateRange());
		System.out.println(person.getBMIChart());
	}

	//Constructors
	public HealthProfile(String firstName, String lastName, String gender, int birthMonth, int birthDay, int birthYear, int heightInInches, int weightInPounds)
	{
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
		this.birthYear = birthYear;
		this.heightInInches = heightInInches;
		this.weightInPounds = weightInPounds;
	}


	//Getters and setters
	public String getFirstName() {return firstName;}
	public void setFirstName(String firstName) { this.firstName = firstName; }

	public String getLastName() { return lastName;}
	public void setLastName(String lastname) { this.lastName = lastName;}

	public String getGender() { return gender;}
	public void setGender(String gender) { this.gender = gender; }

	public int getBirthMonth() { return birthMonth;}
	public void setBirthMonth(int birthMonth) { this.birthMonth = birthMonth; }


	public int getBirthDay() { return birthDay;}
	public void setBirthDay(int birthDay) { this.birthDay = birthDay; }


	public int getBirthYear() { return birthYear;}
	public void setBirthYear(int birthYear) { this.birthYear = birthYear; }


	public int getHeightInInches() { return heightInInches;}
	public void setHeightInInches(int heightInInches) { this.heightInInches = heightInInches; }


	public int getWeightInPounds() { return weightInPounds;}
	public void setWeightInPounds(int weightInPounds) { this.weightInPounds = weightInPounds; }

//calculate age in year
public int getAge()
{

	LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
	LocalDate currentDate = LocalDate.now();
	return Period.between(birthDate, currentDate).getYears();
}
// Calculate maximum Heart Rate
public int getMaxHeartRate()
{

	return 220 - getAge();
}


// Calculate Target Heart rate range(50%, to 85% of max Heart Rate)
public String getTargetHeartRateRange()
{

	int maxHeartRate = getMaxHeartRate();
	int lowerBound = (int) (maxHeartRate * 0.50);
	int upperBound = (int) (maxHeartRate * 0.85);
	return lowerBound + " - " + upperBound + " beats per minute";
}

//Calculate BMI
public double getBMI()
{

	return (weightInPounds * 703.0) / (heightInInches * heightInInches);
}

//BMI Chart
public String getBMIChart()
{

	return "BMI VALUES\nUnderweight: less than 18.5\n" +
		"Normal: between 18.5 and 24.9\n" +
		"Overweight: between 25 and 29.9\n" +
		"Obese: 30 or greater";
}
}
