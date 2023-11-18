package gpacalculator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//// Started at 17:40 // 2023/11/18 
		
		// Formula:
		// totalPoints / totalCreditsAttended
		// pointsForAClass = gradeValue * credits
		// A = 4, B = 3...
		
		Scanner scanner = new Scanner(System.in);
		
		Integer totalPoints = 0;
		Integer totalCredits = 0;
		
		boolean moreClasses = false;
		
		do {	
			Integer credits = 0;
			boolean validCredits = true;
			do {
				validCredits = true;
				
				System.out.println("Enter number of credits:");
				String creditsString = scanner.nextLine();
				
				try {
					credits = Integer.parseInt(creditsString);
				}
				catch (NumberFormatException nfe) {
					System.out.println("Please enter a valid integer");
					validCredits = false;
				}
			}
			while (!validCredits);
	
			
			boolean validGrade = true;
			Integer gradeValue = 0;
			String grade = "";
			do {
				validGrade = true;
				
				System.out.println("Enter grade:");
				grade = scanner.nextLine();
				
				if (grade.equalsIgnoreCase("A") ) {
					gradeValue = 4;
				} else if (grade.equalsIgnoreCase("B")) {
					gradeValue = 3;
				} else if (grade.equalsIgnoreCase("C")) {
					gradeValue = 2;
				} else if (grade.equalsIgnoreCase("D")) {
					gradeValue = 1;
				} else if (grade.equalsIgnoreCase("F")) {
					gradeValue = 0;
				} else {
					System.out.println("You didn't enter a valid grade");
					validGrade = false;
				}
			}
			while (!validGrade);
			
			
			Integer points = gradeValue * credits;
			
			totalPoints += points;
			totalCredits += credits;
			
			System.out.println("Would you like to enter another class? (Y/N):");
			String moreClassesString = scanner.nextLine();
				
			moreClasses = moreClassesString.equalsIgnoreCase("Y");
			
		}
		while (moreClasses);

		
		DecimalFormat df = new DecimalFormat("0.00");
		
		Double gpa = Double.valueOf(totalPoints) / Double.valueOf(totalCredits);	
		
		System.out.println("Credits: " + totalCredits);
		System.out.println("Points: " + totalPoints);
		System.out.println("GPA: " + df.format(gpa));
		
		
		scanner.close();

	}

}
