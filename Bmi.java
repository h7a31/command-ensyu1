import java.util.Scanner;

public class Bmi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("１人目身�m):");
		double height1 = sc.nextDouble();
		System.out.println("１人�体重(kg):");
		double weight1 = sc.nextDouble();
		Syste.out.println("２人�身�(m):");
		double height2 = sc.nextDouble();
		System.out.println("２人�体�(kg):");
		double weight2 = sc.nextDouble();

		double BMI1 = weight / (height * height);
		double BMI2 = weight / (height * height);
		
		System.out.println("１人目のBMI:" + String.at("%.2f" + BMI1));
		System.out.println("２人�BMI:" + String.format("%.2f" + BMI2));
	}
}
