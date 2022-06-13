package Jana60;

import java.util.Scanner;

public class Jsnack1 {

//	public static void main(String[] args) {
//		// Il software deve chiedere per 5 volte all’utente di inserire un numero.
//		//Il programma stampa la somma di tutti i numeri inseriti.
//		//Esegui questo programma in due versioni, con il for e con il while.
	
	
	//ESERCIZIO CON IL FOR
	
//		Scanner scan = new Scanner(System.in);
//		int SommaNumeri = 0;
//		
//		for (int i = 0; i <= 4; i++) {
//		System.out.println("INSERISCI UN NUMERO");
//		int NumeroRichiesto = scan.nextInt();
//		SommaNumeri = (SommaNumeri + NumeroRichiesto);
//		
//	
//		}
//		
//		System.out.println( SommaNumeri);
//		
//		
//		
//		
//		scan.close();
//	}
	
	
	//ESERCIZIO CON IL WHILE
	
	public static void main(String[] args) {		
		
		Scanner scan = new Scanner(System.in);
		
		int contatore = 0 ;
		int SommaNumeri = 0 ;
		
		while(contatore <= 4) {System.out.println("INSERISCI UN NUMERO");
		
		int NumeroRichiesto = scan.nextInt();
		SommaNumeri = (SommaNumeri + NumeroRichiesto);
		 contatore++;
	}
		System.out.println(SommaNumeri);
		scan.close();
  }
	
}
