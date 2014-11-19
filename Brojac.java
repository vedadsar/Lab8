
public class Brojac {
public static void main(String[] args) {
	int sum = 0;
	int i = 1;
	
	for(i=1; i<=3; i=i+1){
		sum =  sum + TextIO.getInt();
	}
	
	System.out.println("Suma tri broja je " +sum);
}
}
