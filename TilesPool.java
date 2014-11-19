public class TilesPool {
	public static void main(String[] args) {
		/**
		 * A program which calculates the number of tiles of a given size
		 * necessary to cover a pool of a given size. Case I: assuming the
		 * number of tiles will always be an integer. Case II: “real life”
		 * 
		 * 
		 */
		System.out.println("Please enter size of tiles in sq.ft");
		int sizeOfTiles = TextIO.getInt();
        System.out.println("Please enter size of pool in sq.ft");
		double sizeOfPool = TextIO.getDouble();
		
		int numberOfTiles = (int) (sizeOfPool/sizeOfTiles);
		
		int ostatak = (int) ( sizeOfPool%sizeOfTiles);
		
		System.out.println("You will need " +numberOfTiles +" and 1/" +ostatak );
		
		
	}

}
