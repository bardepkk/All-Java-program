package ArreyProgram;

public class ReverseArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int b[] = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			b[a.length - 1 - i] = a[i];
		}
		for (int j = 0; j < b.length; j++) {
			System.out.print(b[j] + ",");
		}
	}

}
