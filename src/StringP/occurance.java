package StringP;

public class occurance {

	public static void main(String[] args) {
		String  a="Pranaynn";
		char b[]=a.toCharArray();
		
		for(int i=0;i<b.length;i++)
		{
int count=1;			
for(int j=i+1;j<a.length();j++)
			{
				if(b[i]==b[j])
				{
					count++;
					b[j]='0';
				}
			}
if(count==1 && b[i]!='0')
{
	//System.out.print(b[i]);
System.out.println("occurance of character "+b[i]+" is "+count);	
}
		}

	}

}
