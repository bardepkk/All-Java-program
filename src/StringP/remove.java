package StringP;

public class remove {
	public static void main(String[] args) {
		String a="hxx2sax522661@eut$$";
		a=a.replaceAll("[^a-zA-Z]","");
		a=a.toUpperCase();
		System.out.println(a);
		
	}
}
