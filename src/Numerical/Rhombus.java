package Numerical;

public class Rhombus {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++)
			
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(" ");
			}
		for(int  k=1;k<=8;k++)
		{
			if(k>1 && k<8&&i>1&&i<8)
			{
				System.out.print(" ");
			}else
			{
					System.out.print("*");
			}
		}
		System.out.println();
		}

	}

}
