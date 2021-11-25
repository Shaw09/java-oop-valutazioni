package it.corso.valutazioni;

public class CalcolaValutazione {
	
	int idStundete;
	int percentualeAssenze;
	double mediaVoti;
	
	CalcolaValutazione(int idStundete, int percentualeAssenze, double mediaVoti) {
		
		this.idStundete = idStundete;
		this.percentualeAssenze = percentualeAssenze;
		this.mediaVoti = mediaVoti;
	}

	boolean promosso() {
		boolean promosso;
		
		if(percentualeAssenze > 50) {
			promosso = false;
		} else if(percentualeAssenze > 25 && percentualeAssenze <= 50) {
			promosso = mediaVoti > 2.0;
		} else {
			promosso = mediaVoti >= 2.0;
		}
		
		return promosso;
	
	}
	
	
	
}
