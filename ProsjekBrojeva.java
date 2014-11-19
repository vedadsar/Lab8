
public class ProsjekBrojeva {
	public static void main(String[] args) {

		

		double suma = 0;
		int broj = 0;
		System.out.println("Unesite brojeve vece od nule");
		double unos = TextIO.getDouble();

		while (unos != 0) {
			suma = suma + unos;
			broj = broj + 1;
			unos = TextIO.getDouble();

		}
		if (broj == 0) {
			System.out.println("Morate unijeti barem jedan broj koji nije 0");
		} else {
			System.out.printf("Prosjek je %f", suma / broj);
		}
	}
}
