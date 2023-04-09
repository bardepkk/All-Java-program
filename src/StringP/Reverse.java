package StringP;

public class Reverse {

	public static void main(String[] args) {
		  String c="pranay is an engineer";
	         String []d=c.split(" ");
	         String revs="";
	         for(int i=d.length-1;i>=0;i--)
	 		{
	 			revs=revs+d[i]+" ";
	 		}
	          System.out.println(revs);
	          

	}

}
