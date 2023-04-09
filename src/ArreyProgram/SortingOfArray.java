package ArreyProgram;

import java.util.Arrays;

public class SortingOfArray {

	public static void main(String[] args) {
		int a[] = { 4, 2, 5, 8, 1, 2, -1, 0 };
	//	Arrays.sort(a);   
		for (int i = 0; i < a.length; i++)
		{
			for (int j = i + 1; j < a.length; j++)
			{
				// if(a[i]>a[j])//assending
				if (a[i] < a[j])// for decending
				{
					int c = a[i];
					a[i] = a[j];
					a[j] = c;
				}
			}
		}
		for (int i = 0; i < a.length; i++)
	{
		System.out.print(a[i] + ",");

	}
 
	}

}
