package Numerical;

public class HollowPyramid {

	public static void main(String[] args) {
		 for(int i=1; i<=8; i++)
			 
		 {
			 for(int j=8; j>i; j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1; k<=i;k++)
			 {
				 if(k>1 && k<i && i<8)
				 {System.out.print("  ");}else
				 { System.out.print(" *");}
			 }
			 System.out.println( );
		 }
 for(int i=7; i>=1; i--)
			 
		 {
			 for(int j=8; j>i; j--)
			 {
				 System.out.print(" ");
			 }
			 for(int k=1; k<=i;k++)
			 {
				 if(k>1 && k<i)
				 {System.out.print("  ");}else
				 { System.out.print(" *");}
			 }
			 System.out.println( );
		 }
	}

}
