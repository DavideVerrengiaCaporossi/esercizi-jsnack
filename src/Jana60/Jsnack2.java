package jana60;


import java.util.Scanner;

public class Jsnack2 {

	public static void main(String[] args) {
		// Chiedi all'utente di inserire un numero, se è pari stampa il numero, se è dispari stampa il numero successivo
		
		Scanner scan = new Scanner(System.in);
		
		int NumUtente = 0;
		
	
		System.out.println("Inserisci un numero");
	    NumUtente = scan.nextInt();
		
		if (NumUtente % 2 == 0) {
			System.out.println(NumUtente);
		}
		else {
			System.out.println(NumUtente +1 );
		
	}
		
	scan.close();
	}
}
