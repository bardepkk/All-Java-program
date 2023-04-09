package StringP;

public class occurance2 {

	public static void main(String[] args) {
		String  a="Pranay barde is good person. he is excelent pranay";
		String b[]=a.split(" ");
		
		for(int i=0;i<b.length;i++)
		{
int count=1;			
for(int j=i+1;j<b.length;j++)
			{
				if(b[i].equalsIgnoreCase(b[j]))
				{
					count++;
					b[j]="0";
				}
			}
if(count>1 && b[i]!="0")
{
System.out.println("occurance of character "+b[i]+" - "+count);
}
		}

	}

}
