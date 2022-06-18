public class Question4{
	static boolean a, b, c;
	public static void main (String[] args) {
		boolean x = (a = true) || (b = true) && (c = true);
		System.out.print(a + "," + b + "," + c);
	}
}