import java.util.Scanner;

public class SlobodanPad {
	public static void main(String[] args) {
		int vrijeme;
		double g = 9.81;
		System.out.println("Unesite vrijeme slobodnog pada u sekundama");
		Scanner in = new Scanner(System.in);
		vrijeme = in.nextInt();

		double predjeniPut = g * vrijeme;

		System.out.println("predjeniPut slobodnog pada tokom " + vrijeme
				+ " sekundi je " + predjeniPut + " metara.");
	}
}
