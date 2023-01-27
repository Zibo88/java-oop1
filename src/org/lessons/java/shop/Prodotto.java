package org.lessons.java.shop;

public class Prodotto {

		int codiceProdotto;
		String nome;
		String descrizione;
		float prezzo;
		float iva = 0.22F;
		
		public Prodotto(int codiceProdotto, String nome, String descrizione, float prezzo) {
			this.codiceProdotto = codiceProdotto;
			this.nome = nome;
			this.descrizione = descrizione;
			this.prezzo = prezzo;
		}
		
		float calcola() {
			
			float prezzoFinaleSenzaIva = prezzo;
			
			return prezzoFinaleSenzaIva;
		}
		
		
		float calcola(float iva) {
			
			float prezzoFinaleConIva = prezzo * iva;
			return prezzoFinaleConIva;
		}
		
		
}
