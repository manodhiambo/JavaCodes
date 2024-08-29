import java.util.Scanner;

public class Bodymaxindex
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
	
		// calculating Body Mass Index
		float weightInPounds;
		float heightInInches;

		System.out.print("Enter your height in inches: ");
		heightInInches = input.nextFloat();

		System.out.print("Enter your weight in pounds: ");
		weightInPounds = input.nextFloat();

		float BMI = (weightInPounds * 703f)/(heightInInches * heightInInches);

		System.out.printf("Hi, Your Body Mass Index is %f\n",BMI);

		System.out.println("The following is an information from the Department of Health and Human Services/National Institute of Health, use it to evaluate youself:\n");

		if (BMI < 18.5f)
			System.out.println("You are underweight");
		if (BMI >= 18.5f && BMI <= 24.9f)
			System.out.println("Your have a normal weight");
		if(BMI >= 25f && BMI <= 29.9f)
			System.out.println("You are Overweight");
		if(BMI >= 30f)
			System.out.println("You are Obese");
	}
}
