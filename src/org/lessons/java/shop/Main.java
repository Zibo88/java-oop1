package org.lessons.java.shop;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Prodotto singoloProdotto;
		String nome = "";
		String descrizione = "";
		int codiceProdotto;
		float prezzo = 0;
		
		Random randomNumber = new Random();
		Scanner data = new Scanner(System.in);
		
		
		codiceProdotto = randomNumber.nextInt(10000)+1;
		
		String codiceProdottoString = String. valueOf(codiceProdotto);
		
		
		System.out.println("dimmi il nome del prodotto");
		nome = data.nextLine();
		
		System.out.println("scrivi la descrizione del prodotto");
		descrizione = data.nextLine();
		
		System.out.println("Quanto costa il prodotto");
		prezzo = data.nextFloat();
		
		
		singoloProdotto = new Prodotto(codiceProdotto, nome, descrizione, prezzo);
		
		System.out.println("Codice prodotto:"+" "+codiceProdotto);
		System.out.println("Codice prodotto codice-nome:"+" "+codiceProdotto+"-"+nome);
		
		
		float prezzoDefault = singoloProdotto.calcola();
		System.out.println("Prezzo senza Iva"+" "+prezzoDefault);
		
		float prezzoConIva = prezzoDefault + singoloProdotto.calcola(singoloProdotto.iva);
		
		System.out.println("Prezzo con Iva"+" "+ prezzoConIva);
		
		
		
	}

}
