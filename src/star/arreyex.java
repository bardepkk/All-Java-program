package star;

public class arreyex {

	public static void main(String[] args) {
		int a[]= {10,52,76,8,3,94,54,85};
		
		for(int i=0;i<a.length/2;i++)//arrey reverse by swapping
		{
			
			int c=a[i];
			
			a[i]=a[(a.length-1)-i];
			
			a[(a.length-1)-i]=c;}
		
			for(int i=0;i<a.length;i++)
			{
				System.out.print(a[i]+",");
			}
	    
	}
}
