package star;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a[] = {10,45,65,85,74,39,64,49,32};
/*	System.out.println(a.length);
for(int i=0;i<=a.length-1;i++)
		//for(int i=a.length-1;i>=0;i--)//for arrey reverse print
	{System.out.print(a[i]+",");}
		System.out.println();*/
		
		int b[]=new int[a.length];
	/*	b[0]=a[a.length-1];//a[8];
		b[1]=a[a.length-2];//a[7];
		b[2]=a[a.length-3];//a[6];
		b[3]=a[a.length-4];//a[5];
		b[4]=a[a.length-5];//a[4];
		b[5]=a[a.length-6];//a[3];
		b[6]=a[a.length-7];//a[2];
		b[7]=a[a.length-8];//a[1];
		b[8]=a[a.length-9];//a[0];
		a=b;
		for(int j=0;j<=a.length-1;j++)
			
		{System.out.print(b[j]+",");
		}
		System.out.println();*/
		
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[(a.length-1)-i];
		}
		a=b;
		
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+",");}
		}
}

