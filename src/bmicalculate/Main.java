package bmicalculate;

import java.util.Scanner;

public class Main {
	
	public static double calculate(int weight, int height) {
		weight = (weight *703);
		height = height * height; 
		return weight/height; 
		
	}
	
	public static String message(double bmi) {
		if(bmi > 25) {
			return "Warning! You are overweight"; 
		}
		else if(bmi < 20) {
			return "Warning! You are underweight"; 
		}
		else {
			return "Your weight is healthy"; 
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		System.out.println("What is your height in inches?");
		int height = scanner.nextInt(); 
		System.out.println("What is your weight in pounds?");
		int weight = scanner.nextInt(); 
		double BMI = calculate(weight, height);
		System.out.println(BMI);
		System.out.println(message(BMI));
		
	}
}