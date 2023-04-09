package ArreyProgram;

public class MissingNumber {

	public static void main(String[] args) {
		int no[]= {1,2,3,5,6,7,8};
		int expected_sum=no.length+1;
		int totalSum=expected_sum*(expected_sum+1)/2;
		int sum=0;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}
System.out.println("missing number is "+(totalSum-sum));
	}

}
