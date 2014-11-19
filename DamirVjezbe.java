import java.util.Scanner;


public class DamirVjezbe {
public static void main(String[] args) {
	int broj1;
	int broj2;
	int broj3;
		
	Scanner in = new Scanner(System.in);
	System.out.println("Unestie prvi broj ");
	broj1 = in.nextInt();
	
	System.out.println("Unesite drugi broj ");
	broj2 = in.nextInt();
	
	System.out.println("Unesite treci broj ");
	broj3 = in.nextInt();
	
	if((broj2>broj1) && (broj3>broj1)){
		System.out.println("Najmanji broj je  " +broj1);
		
	}
	
	else if((broj1>broj2) && (broj3>broj2)) {
		System.out.println("Najmanji broj je " +broj2);
	}
	else  {
		System.out.println("Najmanji broj je " +broj3);
	}
			
}
}
