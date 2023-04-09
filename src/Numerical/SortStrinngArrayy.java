package Numerical;

public class SortStrinngArrayy {

	public static void main(String[] args) {
		
		String a[]= {"sonu","zandu","raju","golu","amit","aa","ab","ac"};

		for (int i=0;i<a.length;i++) 
		{
			String temp; 
			for(int j=i+1; j<a.length;j++)
			{
				if(a[i].compareTo(a[j])>0)
				{
					temp=a[i];
					a[i]=a[j];
				    a[j]=temp;	   
				
				}
			}
			System.out.print(a[i]+" ");	
		}
	}

}
