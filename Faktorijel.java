import java.util.Scanner;
public class Faktorijel {
public static void main(String[] args) {
	
 int unos;
 int proizvod = 1;
 
 System.out.println("Unesite vas broj");
 Scanner in = new Scanner(System.in);
 unos = in.nextInt();
 
 for(int i=1; i<=unos; i++){
	 proizvod = proizvod*i;
 }
	System.out.println(proizvod);
}
}
