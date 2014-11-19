import java.util.Scanner;

public class Trokut {
	public static void main(String[] args) {

		double a;
		double b;
		double c;

		Scanner in = new Scanner(System.in);

		System.out.println("Unesite stranicu a");
		a = in.nextDouble();
		System.out.println("Unesite stranicu b");
		b = in.nextDouble();
		System.out.println("Unesite stranicu c");
		c = in.nextDouble();

		if (a > 0 && b > 0 && c > 0 && a + b > c && a + c > b && c + b > a) {
			System.out
					.println("Brojevi koje ste unijeli su moguce stranice trougla");

			double s = (a + b + c) / 2;
			double Povrsina = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			System.out.println("Povrsina trokuta je " + Povrsina);

			double ugaoA = Math.acos(((b * b + c * c - a * a) / (2 * b * c)));

			double ugaoB = Math.acos(((a * a + c * c - b * b) / (2 * a * c)));

			double ugaoC = Math.acos(((b * b + a * a - c * c) / (2 * b * a)));

			if (ugaoA > ugaoB && ugaoA > ugaoC) {
				System.out.println("Najveci je ugao A");
			} else if (ugaoB > ugaoA && ugaoB > ugaoC) {
				System.out.println("Najveci je ugao B");
			} else {
				System.out.println("Najveci ugao je ugao C");
			}
		}
	}
}
