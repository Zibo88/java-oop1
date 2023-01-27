package org.lessons.java.bank;

public class Conto {

	int numeroDiConto;
	String proprietario;
	int saldo = 0;
	
	
	public Conto(int numeroDiConto, String proprietario, int saldo) {
		super();
		this.numeroDiConto = numeroDiConto;
		this.proprietario = proprietario;
		this.saldo = saldo;
	}
	
	void versamento(int saldo , int contanti ) {
			contanti += saldo;
		}

	void prelevare(int saldo, int contanti) {
		
		if( saldo > 0) {
			
			saldo = saldo - contanti;
		}
	}
	
	}
	
	
	

