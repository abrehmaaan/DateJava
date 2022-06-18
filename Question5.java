public class Question5 {
	public static void main (String[] args) {
		byte x = 3, y = 5;
		System.out.print((y % x) + ",");
		System.out.print(y == ((y/x)*x + (y%x)));
	}
}