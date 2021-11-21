package br.com.senac.projetoIntegrador.projectFinal.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

//Iniciando questoes na classe principal		
		Questoes questao     = new Questoes();
		
//Iniciando Scanner para obter respostas do jogador		
		Scanner input = new Scanner(System.in);
	
//Iniciando classe menu para execu��o de m�todos		
		Menu menu = new Menu();	
		
//Iniciando s�rie de pontua��o	
		int pontuacao = 0;
		
//Sinalizador de rodadas 
		int rodada = 0;

//na classe player
		Player jogador = new Player();
		
//Inicio Programa
			
	System.out.println("Por favor, digite seu nome: ");
	jogador.nome = input.nextLine();
	
	System.out.println("Ok "+jogador.nome +" Vamos iniciar o jogo.. \r\n");
	
//Iniciando Jogo
	System.out.println("Voc� foi congelado e acordou no ano 3000, ao ler algumas not�cias voc� percebe que a humanidade\r\n"
			+ "entrou em extin��o por causa da polui��o do meio ambiente e ent�o vagando pela cidade. Voc�\r\n"
			+ "encontra um antigo laborat�rio e lembra que voc� havia lido sobre ele no jornal. O laborat�rio tinha\r\n"
			+ "como prop�sito enviar algu�m para o passado para que pudesse mudar esse cen�rio. Voc� ent�o\r\n"
			+ "passa alguns dias tentando entender como essa m�quina funciona quando finalmente uma luz\r\n"
			+ "acende.\r\n \r\n"
			+ "Voc� entra em t�nel�\r\n \r\n"
			+ "BEM VINDO. VOC� EST� NO ANO DE 2021! SUA MISS�O � SALVAR O PLANETA TERRA !!!\r\n\r\n"
			+ "Voc� escuta isso e, ainda meio zonzo da viagem,  acha um papel perto\r\n"
			+ "do seu p�, ao ler descobre como agir para salvar o planeta.\r\n\r\n"
			+ "�Sua miss�o � ajudar os habitantes locais atrav�s da conscientiza��o. Tudo o que for dito por voc�\r\n"
			+ "ser� divulgado a todos na terra, ent�o responda com CUIDADO!�\r\n\r\n"
			+ "Ao chegar, voc� encontra com algumas pessoas que est�o limpando sua casa depois de uma\r\n"
			+ "festa, eles est�o jogando todos os lixos no mesmo lugar.. Come�e a salvar o planeta.. \r\n");

//Quest�o 1		
		System.out.println("1) Qual o lixo para descarte para as garrafas de vidro? \r\n"
				+ "vermelha \r\n"
				+ "azul \r\n"
				+ "verde \r\n"
				+ "amarela \r\n\r\n"
				+ "Escreva cor correta: \r\n");
		jogador.resposta = input.nextLine();	

		if(jogador.resposta.equalsIgnoreCase(questao.getVerde())) {
			
			System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
			pontuacao = pontuacao + 10;	
		}
		else {
			System.out.println("Ops, parece que voc� errou " + jogador.nome);
			System.out.println(jogador.nome +" voc� quer uma dica?");
			jogador.resposta = input.nextLine();	
			
			if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
				System.out.println("Ok "+ jogador.nome +", vamos eliminar duas op��es para voc�: "
						+ "Agora, as cores que sobraram s�o: \r\n "
				+ "verde \r\n"
				+ "amarela \r\n");
				System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				if(jogador.resposta.equalsIgnoreCase(questao.getVerde()))//verde {
					System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o" );
					pontuacao = pontuacao + 5;	
					
				}else {
					System.out.println("Opssss..  Voc� errou. Tudo bem, ainda existem mais nove quest�es at� o fim do question�rio. Vamos para a pr�xima..");
				}
			}
		
		
		rodada++;
		System.out.println("Sua pontua��o ap�s a "+ rodada +"� rodada �: "+pontuacao);
		
		
		System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {
			
			System.out.println("CURIOSIDADE");
		}
		
		else {
			System.out.println("Tudo bem.. vamos para mais um desafio");	
		}
		
		
//_____________________________________________________________________________________________________________________________________//		
		
		
//Quest�o 2	
			System.out.println("2) Qual o lixo para descarte para as latas de refrigerante ? \r\n"
						+ "Amarela \r\n"
						+ "Cinza \r\n"
						+ "Vermelha \r\n"
						+ "Azul \r\n\r\n"
						+ "Escreva cor correta: \r\n");
				jogador.resposta = input.nextLine();	

				if(jogador.resposta.equalsIgnoreCase(questao.getAmarela())) {
					
					System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
					pontuacao = pontuacao + 10;	
				}
				else {
					System.out.println("Ops, parece que voc� errou " + jogador.nome + "\n");
					System.out.println(jogador.nome +" voc� quer uma dica?");
					jogador.resposta = input.nextLine();	
					
					if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
						System.out.println("Ok "+ jogador.nome +", vamos eliminar duas op��es para voc�: "
						+ "Agora, as cores que sobraram s�o: \r\n "
						+ "Amarela \r\n"
						+ "Vermelha \r\n");
						System.out.println("Tente acertar novamente: ");
						jogador.resposta = input.nextLine();	
						if(jogador.resposta.equalsIgnoreCase(questao.getAmarela()))//Amarela {
							System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o" );
							pontuacao = pontuacao + 5;		
						}else {
							System.out.println("Opssss..  Voc� errou. Tudo bem, ainda existem mais nove quest�es at� o fim do question�rio. Vamos para a pr�xima..");
						}
					}
						
				rodada++;
				
				System.out.println("Sua pontua��o ap�s a "+ rodada +"� rodada �: "+ pontuacao);
					
				System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
				jogador.resposta = input.nextLine();	
				
				if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
					System.out.println("CURIOSIDADE");		
				}
				
				else {
					System.out.println("Tudo bem.. vamos para mais o desafio n�mero 3");	
				}			
		
		System.out.println("Programa encerrado");
		
		input.close();
	}
}