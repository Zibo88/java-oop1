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
	
	float versamento() {
		
			return saldo;

		}

	float prelevare() {
		
		
		if( saldo > 0) {
			
			return saldo;
		}
		
		return saldo;
		
	}
	
	}
	
	
	

