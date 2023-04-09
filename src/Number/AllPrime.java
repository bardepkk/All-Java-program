package Number;

import java.util.Scanner;

public class AllPrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter anumber upto which find the prime number");
		int num = sc.nextInt();

		for (int j = 1; j <= num; j++) {
			int count = 0;
			for (int i = 2; i < j; i++) {

				if (j % i == 0) {
					count = count + 1;
				}
			}

			if (count == 0) {
				System.out.print(j + ",");
			}

		}

	sc.close();}

}
