package Numerical;

import java.util.Scanner;

public class FactorialByMethod {
	static int fact = 1;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int number = sc.nextInt();
		FactorialByMethod factorialByMethod = new FactorialByMethod();
		int result = factorialByMethod.cal(number);
		System.out.println(result);
		sc.close();
	}

	int cal(int number) {
		for (int i = 1; i <= number; i++) {
			fact = fact * i;
		}
		return fact;
	}

}
