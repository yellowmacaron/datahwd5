package datad4;

public class countSquare {

	public static void main(String[] args) {
		int a = 17;
		int b = 24;
		System.out.println(countSquare(a, b));

		int c = 3;
		int d = 9;
		System.out.println(countSquare(c, d));
	}

	public static int countSquare(int a, int b) {
		int count = 0;
		int squa = (int) Math.sqrt(a);
		int sqb = (int) Math.sqrt(b);
		for (int i = squa; i <= sqb; i++) {
			if (i * i >= a && i * i <= b) {
				count++;
			}
		}
		return count;
	}
}
