package basics;

public class SalaryCalculator {
	public static void main(String[] args) {
		
		//Declare avariable
		String career;
		System.out.println("Program is starting");
		
		//Define a variable
		career = "Software Developer";
		System.out.println("My career: " + career);
		
		//declare & define
		int hoursPerWeek = 40;
		int weeksPerYear = 50;
		double rate = 42.50;
		
		double salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My selary as a " + career + " at the rate of $" + rate + " per hour is $" + salary + " per year.");
	}

}
