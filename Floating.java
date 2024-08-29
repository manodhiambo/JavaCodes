import java.util.Scanner;

public class Floating
{

	public static void main(String[] args)
	{
	
		Scanner input = new Scanner(System.in);

		float PI = 3.14159f;
		float radius;

		System.out.print("Enter the radius of a circle: ");
		radius = input.nextInt();

		System.out.printf("The area of the cirle is %f\n", (PI * radius * radius));
		System.out.printf("The diameter of the circle is %f\n",(2 * radius));
		System.out.printf("The circumference of the circle is %f\n",(2 * PI * radius));
	}
}
