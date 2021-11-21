package br.com.senac.projetoIntegrador.projectFinal.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

//Iniciando questões na classe principal		
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
		
//Iniciando Scanner para obter respostas do jogador		
		Scanner input = new Scanner(System.in);
		
//Local para armazenar o nome do jogador 
		String nome;

//Local para armazenar as respostas do jogador
		String resposta;
	
//Iniciando classe menu para execução de métodos		
		Menu menu = new Menu();
		
//Iniciando série de pontuação	
		int pontuacao = 0;

//na classe player
		Player jogador = new Player();
		
//Inicio Programa

		System.out.println("Por favor, digite seu nome: ");
		nome = input.nextLine();
		jogador.nome = nome;
		System.out.println("Olá " + jogador.nome);
		
		resposta = input.nextLine();		

	
		if(resposta.equals(um.getVerde())) {
			System.out.println("Simm ");
			pontuacao++;
				System.out.println(pontuacao);
		}
		
		System.out.println("Programa encerrado");
		input.close();
	}
}