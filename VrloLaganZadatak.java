import java.util.Scanner;
public class VrloLaganZadatak {
public static void main(String[] args) {
	int i=0;
	String ime;
	int broj;
	System.out.println("Unesite vase ime ");
	Scanner in = new Scanner(System.in);
	ime = in.next();
	System.out.println("Unesite broj ponavljanja.");
	broj = in.nextInt();
	while (i<broj){
		System.out.println( ime +" se ne voli ponavljati");
		i=i+1;
	}
			
}
}
