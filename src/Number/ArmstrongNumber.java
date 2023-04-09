package Number;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int a = 152;
		int c = a;
		int rem = 0;
		int sum = 0;
		while (a > 0) 
		{
			rem = a % 10;
			a = a / 10;
			sum = sum + rem * rem * rem;
		}
		if (sum == c)
		{
			System.out.println("number is  armmstrong");
		} else
		{
			System.out.println("number is not armmstrong");
		}

	}

}
