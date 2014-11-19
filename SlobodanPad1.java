import java.util.Scanner;


public class SlobodanPad1 {
public static void main(String[] args) {
	double visina;
	double vrijeme = 60;
	double g = 9.81;
	System.out.println("Unesite visinu sa koje ce te pustiti da tijelo slobodno pada i mjeriti predjeni put u narednih 60 sekundi");
	Scanner in = new Scanner(System.in);
	visina = in.nextInt();
	
	double predjeniPut = vrijeme * g;
	double vrijemePada = (2*visina)/g;		
	double vrijeme2 =  Math.sqrt(vrijemePada);
	double ukupnoVrijeme = vrijeme2-vrijeme;
	if(visina<predjeniPut){
	System.out.println("Tijelo je udarilo od tlo za" +vrijeme2 +"sekundi");

	}
	else{
		System.out.println("Tijelo jos nije udarilo od tlo, vrijeme koje je preostalo da tijelo udari od tlo " +ukupnoVrijeme +" sekundi");
	}
}
}
