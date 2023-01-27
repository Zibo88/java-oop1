package org.lessons.java.bank;

import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner data = new Scanner(System.in);
		Random randomNumber = new Random();
		Conto nuovoConto;
		
		
		int numeroDiConto;
		String userName = "";
		int saldo = 100;
		int contanti = 0;
		String userChoiche = "";
		
		System.out.println("Dimmi il tuo nome");
		userName = data.nextLine();
		
		numeroDiConto =  randomNumber.nextInt(1000)+1;
		
		nuovoConto = new Conto(numeroDiConto, userName, saldo);
		
		System.out.println("Salve, che operazione vuole compiere?");
		System.out.println("Scriva versare, se vuole versare");
		System.out.println("Scriva prelevare, se vuole prelevare");
		userChoiche = data.nextLine();
		
		if(userChoiche.equals("versare")) {
			System.out.println("quanto vuoi versare?");
			System.out.println("Se vuoi porre fine all'operazione digita 0");
			contanti  = data.nextInt();
				
				if(contanti != 0) {
					int sum = saldo + contanti;
					System.out.println("Nome:" + " " + nuovoConto.proprietario);
					System.out.println("Numero di conto:" + " " + nuovoConto.numeroDiConto);
					System.out.println("Il saldo è:" + sum);
				}

				if(contanti == 0) {
					System.out.println("operazione annullata");
				}

			}else if(userChoiche.equals("prelevare")) {
				
				System.out.println("quanto vuoi prelevare?");
				System.out.println("Se vuoi porre fine all'operazione digita 0");
				contanti  = data.nextInt();
				
				if(contanti <= saldo) {
					if(contanti != 0) {
						saldo = saldo - contanti;	
						System.out.println("Il nuovo saldo è" + " " + saldo);
					}
					
					if(contanti == 0) {
						System.out.println("operazione annullata");
					}
				}else {
					System.out.println("Non ci sono abbastanza fondi");
				}
				
			}
	
		data.close();
		
		
		
		
		
	}

}
