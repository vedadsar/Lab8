import java.util.Scanner;

public class zbir {
	public static void main(String[] args) {

		double broj1;
		double broj2;

		Scanner in = new Scanner(System.in);

		do {
			System.out.println("unesite dva broja");
			broj1 = in.nextDouble();
			broj2 = in.nextDouble();
			if (broj1 == 0 && broj2 == 0) {
				break;
			}
			System.out.println("zbir = " + (broj1 + broj2));

		} while (broj1 != 0 && broj2 != 0);

	}

}
