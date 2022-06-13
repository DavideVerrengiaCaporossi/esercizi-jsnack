package Jana60;

import java.util.Random;

public class Jsnack3 {

	public static void main(String[] args) {
		// Generatore di “nomi cognomi” casuali: prendendo una lista di nomi e una lista di cognomi, genera una falsa lista di 3 invitati.
		
		String[] Nomi = {"alfredo","vegeta","Kakarot","doraemon"};
		String[] Cognomi = {"flash","blob","fium","sbam"};
		
  Random random = new Random();
		
		for(int i = 0; i<4 ; i++) {
			int random1 = random.nextInt(4);
			int random2 = random.nextInt(4);
			System.out.println(Nomi[random1] + " " + Cognomi[random2]);
		
	}

}
}
