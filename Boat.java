public class Boat {
	public static void main(String[] args) {
		/**
		 * Given the speed of a boat (as integer) calculate the time it will
		 * need to cover a given distance. The Speed is defined in miles/hour
		 * the distance in kilometers.
		 * 
		 * 
		 */

		System.out.println("Unesite brzinu broda (m/h) ");
		int brzina = TextIO.getInt();
		System.out.println("Unesite predjenu distancu u kilometrima");
		double predjeniPut = TextIO.getDouble();

		double time = (double) predjeniPut / (brzina * 1.6);
		System.out.println("Potreban broj sati da predjete taj put je" + time
				+ ",minuta " + time * 60 + ",sekundi " + time * 1200);

	}

}
