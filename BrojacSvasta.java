import java.util.Scanner;

public class BrojacSvasta {
	public static void main(String[] args) {
		double a;
		double b;

		Scanner in = new Scanner(System.in);

		do {
			a = in.nextDouble();
			b = in.nextDouble();
			if (b == 0 && a == 0) {
				return;
			}
			System.out.printf("Suma %f Proizvod %f modul %f ", a + b, a * b, a
					% b);
		} while (a != 0 && b != 0);

	}
}
