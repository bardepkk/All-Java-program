package StringP;

public class rough {

	public static void main(String[] args) {
		String a="PranayFnn474#W@%22";
		int totalChar=a.length();
		int upperCase=0;
		int lowerCase=0;
		int digit=0;
		int other=0;
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(Character.isUpperCase(c))
			{
				upperCase++;
			}else if(Character.isLowerCase(c))
			{
				lowerCase++;
			}else if(Character.isDigit(c))
			{
				digit++;
			}else
				other++;
		}
         System.out.println(upperCase+"-upperCase");
         System.out.println(lowerCase+"-lowerCase");
         System.out.println(digit+"-digit");
         System.out.println(other+"-other");
         System.out.println(totalChar+"-totalChar");
       double upperCasePercentage=(upperCase*100)/totalChar;
       double lowerCasePercentage=(lowerCase*100)/totalChar;
       double digitPercentage=(digit*100)/totalChar;
       double otherPercentage=(other*100)/totalChar;
       System.out.println(upperCasePercentage+"% upperCase");
       System.out.println(lowerCasePercentage+"% lowerCase");
       System.out.println(digitPercentage+"% digit");
       System.out.println(otherPercentage+"% other");
	}

}
