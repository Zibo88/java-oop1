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
		float iva = 0.22F;
		
		Random randomNumber = new Random();
		Scanner data = new Scanner(System.in);
		
		codiceProdotto = randomNumber.nextInt(10000)+1;
		
		System.out.println("dimmi il nome del prodotto");
		nome = data.nextLine();
		
		System.out.println("scrivi la descrizione del prodotto");
		descrizione = data.nextLine();
		
		System.out.println("Quanto costa il prodotto");
		prezzo = data.nextFloat();
		
		singoloProdotto = new Prodotto(codiceProdotto, nome, descrizione, prezzo, iva);
		System.out.printf("%08d\n", codiceProdotto);
		System.out.println("Codice prodotto codice-nome:"+ singoloProdotto.longName());
		
		float prezzoDefault = singoloProdotto.calcola();
		System.out.println("Prezzo senza Iva"+" "+prezzoDefault);
		
		float prezzoConIva = prezzoDefault + singoloProdotto.calcolaConIva();
		
		System.out.println("Prezzo con Iva"+" "+ prezzoConIva);
		
		data.close();
		
	}

}
