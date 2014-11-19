import java.util.Scanner;

/**
 * Provjeriti dali unesena rijec ima duplih slova CASE SENSITIVE
 * 
 * @author vedadzornic
 *
 */
public class StringZnakovi {
	public static void main(String[] args) {
		String unos;

		System.out.println("Unesite jednu rijec ");
		Scanner in = new Scanner(System.in);
		unos = in.next();

		for (int i = 0; i < (unos.length()); i++) {
			String Slovo = unos.substring(i, i + 1);
          char slovo1 = {unos.charAt(i)};

System.out.println(slovo1);
				
					
			
								
			
		}
	}
}