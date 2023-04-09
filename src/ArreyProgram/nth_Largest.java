package ArreyProgram;

public class nth_Largest {

	public static void main(String[] args) {
		 int marks[]= { 4, 2, 5, 8, 1, 2, -1, 0,9 };
		 for(int i=0;i<marks.length;i++)
		 {
			 for(int j=i+1;j<marks.length; j++)
			 {
				 if(marks[i]<marks[j])
				 {
					 int a=marks[i];
					 marks[i]=marks[j];
					 marks[j]=a;
							 
				 }
			 }
			if(i==3)
			 {System.out.println(marks[i]);
			 break;
			 }
			 
				
		 }
		
	}

}
