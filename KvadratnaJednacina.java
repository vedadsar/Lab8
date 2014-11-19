
public class KvadratnaJednacina {
public static void main(String[] args) {
	
	System.out.println("Unesite parametre a,b,c za kvadratnu jednacinu");
	int a=TextIO.getInt();
	int b=TextIO.getInt();
	int c=TextIO.getInt();
	int D = b*b -4*a*c;
	 if( D<0){
		 System.out.println("Kvadratna jednacina nije moguca, D < 0");
		
	 }
		 else{
			 double x1 = (double) (-b + Math.sqrt(D))/(2*a);
			 double x2 = (double) (-b-Math.sqrt(D))/(2*a);
			 
			 System.out.printf("Vrijednosti x1 %f i x2 %f", x1 , x2);
		 }
	 }
	
	
}
