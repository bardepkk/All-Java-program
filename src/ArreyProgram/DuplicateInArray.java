package ArreyProgram;

public class DuplicateInArray {

	public static void main(String[] args) {
		int a[] = { 10, 15, 6, 8, 7, 5, 6, 9, 8, 15,15 };
		for (int i = 0; i < a.length; i++) 
		{
			int count = 1;
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] == a[j])
				{
					count++;
					a[j]=0;
				}
			}
			if (count>=1 &&  a[i]!=0) //count>0  for removing duplicate
			{
				System.out.print(a[i] + "="+count+",");
			
			}
		}

	}

}
