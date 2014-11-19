import java.util.Random;

public class PogoditiBroj {
	public static void main(String[] args) {

		int x = (int) (1 + (Math.random() * 6));
		System.out.println("Upisujte brojeve s ve dok ne pogodite");
		int unos = TextIO.getInt();

		while (unos != x) {
			unos = TextIO.getInt();

		}
		System.out.println("Pogodili ste !!!");
	}

}
