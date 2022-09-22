import java.util.Scanner;
public class Bmi{
	public static void main(String[] args){

	Scanner sc = new Scanner(System.in);
	System.out.print("Input Weight in Kilogram");
	double weight = sc.nextDouble();
	System.out.print("\n Input height in meters");
	double height = sc.nextDouble();
	double BMI = weight/(height*height);
	System.out.print("\nThe body Mass Index (BMI) is " +BMI + "kg/m^2");
	
}
}