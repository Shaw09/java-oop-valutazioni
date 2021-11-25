package it.corso.valutazioni;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		CalcolaValutazione[] cv = new CalcolaValutazione[20];
		
		Random randomGen = new Random();
		
		int id;
		int percentualeAssenze;
		double mediaVoti;
		
		int promossi = 0;
		
		for(int i = 0; i < cv.length; i++) {
			id = i + 1;
			percentualeAssenze = randomGen.nextInt(101);
			mediaVoti = randomGen.nextDouble() * 5.0;
			
			
			cv[i] = new CalcolaValutazione(id, percentualeAssenze, mediaVoti);
			System.out.println("Id studente:  " + cv[i].idStundete);
			System.out.println("Assenze: " + cv[i].percentualeAssenze);
			System.out.println("Media voti: " + cv[i].mediaVoti);
			
			if(cv[i].promosso()) {
				System.out.println("Promosso");
				promossi++;
			} else {
				System.out.println("Bocciato");
			}
		}

		System.out.println("Promossi " + promossi + " studenti");
		
	}

}
