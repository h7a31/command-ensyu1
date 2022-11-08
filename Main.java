import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("身長:(m):");
		double height = sc.nextDouble();
		System.out.println("体�:(kg):");
		double weight = sc.nextDouble();

		double BMI = weight / (height * height);
		
		System.out.println("BMI:" + String.format("%.2f",BMI));
	}
}
