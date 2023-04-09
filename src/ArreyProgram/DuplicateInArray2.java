package ArreyProgram;

public class DuplicateInArray2 {

	public static void main(String[] args) {
		int a[] = { 10, 15, 6, 8,2,12,13 };
		int b[]= {11,12,13,15};
		for (int i = 0; i < a.length; i++) 
		{
			int count = 1;
			for (int j = 0 ; j < b.length; j++) 
			{
				if (a[i] == b[j])
				{
					count++;
					a[j]=0;
				}
			}
			if (count>1 &&  a[i]!=0) //count>0  for removing duplicate
			{
				System.out.print(a[i] + "="+count+",");
			
			}
		}

	}

}
