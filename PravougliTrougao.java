
public class PravougliTrougao {
public static void main(String[] args) {
	System.out.println("Unesite 3 stranice pravouglog trougla");
	int a = TextIO.getInt();
	int b = TextIO.getInt();
	int c = TextIO.getInt();
	
	
    if( a>b && a>c){
    	if (a*a == b*b + c*c){
    		System.out.println("Trougao je pravougli");
    	}
    	else{
    		System.out.println("Trougao nije pravougli");
    	}
    		
	}
	
    else if ( b>a && b>c){
    	
           if(b*b == c*c + a*a){
        	   System.out.println("trougao je pravougli");
           }
           else{
        	   System.out.println("Trougao nije pravougli");
           }
    	
    }
    else  {
    	if(c*c== a*a + b*b){
    		System.out.println("Trougao je pravougli");
    		
    	}
    	else{
    		System.out.println("trougao nije pravougli");
    	}
    }
}
}
