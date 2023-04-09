package Numerical;

import java.util.Scanner;

public class SwappingOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a First Nummber");
		int number1=sc.nextInt();
		System.out.println("Enter a Second Nummber");
		int number2=sc.nextInt();
		
//		int c=number1;
//		number1=number2;
//		number2=c;
//		System.out.println("number1="+ number1);
//		
//		System.out.println("number2= "+ number2);
	

	number1=number1+number2;
	number2=number1-number2;
	number1=number1-number2;
	System.out.println("number1="+ number1);
	
	System.out.println("number2= "+ number2);
	sc.close();
	}
}
