package mortgagecalculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

	private static final int MONTHS_IN_A_YEAR = 12;
	
	public static void main(String[] args) {

		// M = P * (i(1+i)^n / ((1+i)^n - 1))
		// M = monthly payment amount
		// P = principal // The principal is the amount you borrowed and have to pay back
		// i = monthly interest rate
		// n = number of payments
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the principal amount:");
		double principal = scanner.nextDouble();
		
		System.out.println("Enter the annual interest rage:");
		float annualInterestRate = scanner.nextFloat() / 100;
		
		System.out.println("Enter the term in years:");
		int termInYears = scanner.nextInt();
		
		scanner.close();
		
		float monthlyInterestRate = annualInterestRate / MONTHS_IN_A_YEAR;
		int numberOfPayments = termInYears * MONTHS_IN_A_YEAR;
		
//		double monthlyPayment = principal * ( i*((1+i)^n) / (((1+i)^n) -1) );
//		double monthlyPayment = principal * ( monthlyInterestRate*((1+monthlyInterestRate)^numberOfPayments) / (((1+monthlyInterestRate)^numberOfPayments) -1) );
		double monthlyPayment = principal * ( monthlyInterestRate*(Math.pow((1+monthlyInterestRate), numberOfPayments)) / ((Math.pow((1+monthlyInterestRate), numberOfPayments)) -1) );
//		double monthlyPayment = principal * (
//				(monthlyInterestRate * (Math.pow(1 + monthlyInterestRate, numberOfPayments))) /
//				((Math.pow(1 + monthlyInterestRate, numberOfPayments)) - 1)
//			);
		
		System.out.println("Monthly payment: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));
				// Beware that NumberFormat will just work with your Java instance locale!
		
		System.out.println("Total payback amount: " + NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments));
		
		
	}

}
