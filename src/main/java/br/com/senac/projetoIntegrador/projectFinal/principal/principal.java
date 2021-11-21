package br.com.senac.projetoIntegrador.projectFinal.principal;

import java.util.Scanner;

public class principal {
	
	public static void main(String[] args) {

		Questoes um     = new Questoes();
		Questoes dois   = new Questoes();
		Questoes tres   = new Questoes();
		Questoes quatro = new Questoes();
		Questoes cinco  = new Questoes();
		Questoes seis   = new Questoes();
		Questoes sete   = new Questoes();
		Questoes oito   = new Questoes();
		Questoes nove   = new Questoes();
		Questoes dez    = new Questoes();		
		
//Inicio Programa
		Scanner input = new Scanner(System.in);
		String resposta;
		
		
		player jogador = new player();
		jogador.nome = "Henrique";

		
		System.out.println("Olá " + jogador.nome);

		resposta = input.nextLine();
		resposta.equalsIgnoreCase("verde");
		
		System.out.println(resposta);
		System.out.println(um.getVerde());
	
		if(resposta == um.getVerde()) {
			System.out.println("S");
		}
		System.out.println("Programa encerrado");
		input.close();
	}
}