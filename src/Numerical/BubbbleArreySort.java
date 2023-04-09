package Numerical;

public class BubbbleArreySort {

	public static void main(String[] args) {
	
int a[]= {1,15,2,46,3,8,45};

for (int i=0;i<a.length;i++) 
{
	int temp;
	for(int j=i+1; j<a.length;j++)
	{
		if(a[i]>a[j])
		{
			temp=a[i];
			a[i]=a[j];
		   a[j]=temp;	   
		
		}
	}
	System.out.print(a[i]+",");	
}



	}

}
