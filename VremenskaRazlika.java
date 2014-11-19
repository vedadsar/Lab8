
public class VremenskaRazlika {
public static void main(String[] args) {
	
	System.out.println("Unesite sat,minut i sekunde prvog vremenskog intervala ");
	int sat = TextIO.getInt();
	int minut = TextIO.getInt();
	int sekund = TextIO.getInt();
	
	System.out.println("Unesite sat, minut i sekund drugog vremenskog intervala ");
	
	int sat1 = TextIO.getInt();
	int minut1 = TextIO.getInt();
	int sekund1 = TextIO.getInt();
	
	
		int prviInterval = sat*	3600 + minut*60 + sekund;
		int drugiInterval = sat1*3600 + minut1*60 + sekund1;
		
		if( prviInterval>drugiInterval){
			int razlika = prviInterval - drugiInterval;
		    int minutR = razlika/60;
		    int satR =minutR/60;
		    
		    		
			System.out.printf("Vremenski interval je %2d sati  %2d minuta  %2d sekundi",satR, minutR%60, (minutR/60)%60 );
			
			
			
		}
		else {
			int razlika1 = drugiInterval - prviInterval;
			 int minutR1 = razlika1/60;
			   int satR1 =minutR1/60;
			    
			    		
				System.out.printf("Vremenski interval je %2d sati  %2d minuta  %2d sekundi",satR1, minutR1%60, (minutR1/60)%60 );
		}
	
}
}
