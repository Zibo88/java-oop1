package org.lessons.java.shop;

public class Prodotto {

		int codiceProdotto;
		String nome;
		String descrizione;
		float prezzo;
		float iva = 0.22F;
		
		public Prodotto(int codiceProdotto, String nome, String descrizione, float prezzo, float iva) {
			this.codiceProdotto = codiceProdotto;
			this.nome = nome;
			this.descrizione = descrizione;
			this.prezzo = prezzo;
			this.iva = iva;
		}
		
		float calcola() {
			
			float prezzoFinaleSenzaIva = prezzo;
			
			return prezzoFinaleSenzaIva;
		}
		
		float calcolaConIva() {
			float prezzoFinaleConIva = prezzo*iva;
			return prezzoFinaleConIva;
		}
		
		String longName() {
			String allName = codiceProdotto + nome;
			
			return allName;
		}
		
		
//		modificare
//		float calcola(float iva) {
//			
//			float prezzoFinaleConIva = prezzo * iva;
//			return prezzoFinaleConIva;
//		}
		
//		nome esteso
		
		
//		nome padding
}
