package Number;
import java.util.Scanner;
public class PallendromNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a number");
		int num= sc.nextInt();
		
		int org=num;
		int rev=0;
		
	while(num!=0)
		
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		
if(rev==org)
{System.out.println("number is pallendrom");}
else {System.out.println("not pallendrom");}
sc.close();
	}

}
