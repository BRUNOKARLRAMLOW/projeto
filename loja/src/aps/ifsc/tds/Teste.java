package aps.ifsc.tds;

import java.util.Scanner;

public class Teste {
	
	public void msin(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int user;
		String name;
		
		String CPF;
		Endereco enders= new Endereco();
		PessoaFisica cliente = new PessoaFisica(user, name, enders, CPF);
	}

}
