package br.com.senac.projetoIntegrador.projectFinal.principal;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {

//Iniciando questoes na classe principal		
		Questoes questao     = new Questoes();
		
//Iniciando Scanner para obter respostas do jogador		
		Scanner input = new Scanner(System.in);
	
//Iniciando classe menu para execução de métodos		
		Menu menu = new Menu();	
		
//Iniciando série de pontuação	
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
	System.out.println("Você foi congelado e acordou no ano 3000, ao ler algumas notícias você percebe que a humanidade\r\n"
			+ "entrou em extinção por causa da poluição do meio ambiente e então vagando pela cidade. Você\r\n"
			+ "encontra um antigo laboratório e lembra que você havia lido sobre ele no jornal. O laboratório tinha\r\n"
			+ "como propósito enviar alguém para o passado para que pudesse mudar esse cenário. Você então\r\n"
			+ "passa alguns dias tentando entender como essa máquina funciona quando finalmente uma luz\r\n"
			+ "acende.\r\n \r\n"
			+ "Você entra em túnel…\r\n \r\n"
			+ "BEM VINDO. VOCÊ ESTÁ NO ANO DE 2021! SUA MISSÃO É SALVAR O PLANETA TERRA !!!\r\n\r\n"
			+ "Você escuta isso e, ainda meio zonzo da viagem,  acha um papel perto\r\n"
			+ "do seu pé, ao ler descobre como agir para salvar o planeta.\r\n\r\n"
			+ "“Sua missão é ajudar os habitantes locais através da conscientização. Tudo o que for dito por você\r\n"
			+ "será divulgado a todos na terra, então responda com CUIDADO!”\r\n\r\n"
			+ "Ao chegar, você encontra com algumas pessoas que estão limpando sua casa depois de uma\r\n"
			+ "festa, eles estão jogando todos os lixos no mesmo lugar.. Começe a salvar o planeta.. \r\n");

rodada++;
//Questão 1		
		System.out.println("1) Qual o lixo para descarte para as garrafas de vidro? \r\n"
				+ "vermelha \r\n"
				+ "azul \r\n"
				+ "verde \r\n"
				+ "amarela \r\n\r\n"
				+ "Escreva cor correta: \r\n");
		jogador.resposta = input.nextLine();	

		if(jogador.resposta.equalsIgnoreCase(questao.getVerde())) {
			
			System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
			pontuacao = pontuacao + 10;	
		}
		else {
			System.out.println("Ops, parece que você errou " + jogador.nome);
			System.out.println(jogador.nome +" você quer uma dica?");
			jogador.resposta = input.nextLine();	
			
			if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
				System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
						+ "Agora, as cores que sobraram são: \r\n "
				+ "verde \r\n"
				+ "amarela \r\n");
				System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				if(jogador.resposta.equalsIgnoreCase(questao.getVerde()))//verde {
					System.out.println("UHULL, grande resposta. Vamos para a proxima questão" );
					pontuacao = pontuacao + 5;	
					
				}else {
					System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
				}
			}
		
		System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+pontuacao);
		
		
		System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {
			
			System.out.println("CURIOSIDADE");
		}
		
		else {
			System.out.println("Tudo bem.. vamos para mais um desafio");	
		}
		
		
//_____________________________________________________________________________________________________________________________________//		

//Questão 2	
	rodada++;		
		
			System.out.println("2) Qual o lixo para descarte para as latas de refrigerante ? \r\n"
						+ "Amarela \r\n"
						+ "Cinza \r\n"
						+ "Vermelha \r\n"
						+ "Azul \r\n\r\n"
						+ "Escreva a cor correta: \r\n");
				jogador.resposta = input.nextLine();	

				if(jogador.resposta.equalsIgnoreCase(questao.getAmarela())) {
					
					System.out.println("uhuul, continue assim!");
					pontuacao = pontuacao + 10;	
				}
				else {
					System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
					System.out.println(jogador.nome +" você quer uma dica?");
					jogador.resposta = input.nextLine();	
					
					if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
						System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
						+ "Agora, as cores que sobraram são: \r\n "
						+ "Amarela \r\n"
						+ "Azul \r\n");
						System.out.println("Tente acertar novamente: ");
						jogador.resposta = input.nextLine();	
						if(jogador.resposta.equalsIgnoreCase(questao.getAmarela()))//Amarela {
							System.out.println("Grande resposta."+ jogador.nome +" Vamos para a próxima" );
							pontuacao = pontuacao + 5;		
						}else {
							System.out.println("Opssss..  Você errou "+ jogador.nome +". Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
						}
					}
				
				System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
					
				System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
				jogador.resposta = input.nextLine();	
				
				if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
					System.out.println("Essa lata demora de 200 a 500 anos para se decompor, sem contar que a reciclagem de\r\n"
							+ "latas ajuda além do meio ambiente, a renda de várias famílias! Você consegue, muitas vidas te\r\n"
							+ "agradecerão");		
				}
				
				else {
					System.out.println("Tudo bem.. vamos para mais o desafio número 3");	
				}	

				
//_____________________________________________________________________________________________________________________________________//		
				
//Questão 3
				
	rodada++;//3
	System.out.println("Agora vamos para a rodada número " + rodada);
	
				System.out.println("3) Agora só faltam os copos de plástico... \r\n"
						+ "Marrom \r\n"
						+ "Vemelha \r\n"
						+ "Verde  \r\n"
						+ "Amarela \r\n\r\n"
						+ "E agora? Consegue escrever a cor correta? digite ...\r\n");
				jogador.resposta = input.nextLine();	

				if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
					
					System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
					pontuacao = pontuacao + 10;	
				}
				else {
					System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
					System.out.println(jogador.nome +" você quer uma dica?");
					jogador.resposta = input.nextLine();	
					
					if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
						System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
						+ "Agora, as cores que sobraram são: \r\n "
							+ "Amarela \r\n"
								+ "Vermelha \r\n");
						
						System.out.println("Tente acertar novamente: ");
							jogador.resposta = input.nextLine();	
							
						if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
							System.out.println("Nada como acertar após uma ajudinha né? .. Vamos para a proxima questão" );
								pontuacao = pontuacao + 5;		
						}else {
							System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
						}
					}
				
				System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
					
				System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
				jogador.resposta = input.nextLine();	
				
				if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
					System.out.println("Sabia que por ano oito milhões de toneladas de plástico vão parar nas águas dos\r\n"
							+ "oceanos, levando 100 mil animais marinhos à morte?");
							System.out.println("Essa curiosidade é mesmo interessante, ne ? Agora, vaamos para o próximo desafio :)");
				}
				
				else {
					System.out.println("Tudo bem.. vamos continuar os desafio");	
				}		
				
//_____________________________________________________________________________________________________________________________________//						
//Questão 4	
	
	rodada++;//4
	System.out.println("Iniciando a rodada número " + rodada);
	
	System.out.println("3) Qual o lixo para descarte para as latas de refrigerante ? \r\n"
			+ "Amarela \r\n"
			+ "Cinza \r\n"
			+ "Vermelha \r\n"
			+ "Azul \r\n\r\n"
			+ "Escreva cor correta: \r\n");
	jogador.resposta = input.nextLine();	

	if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
		
		System.out.println("UHUL.. Nessa você mandou bem viu ?! ");
		pontuacao = pontuacao + 10;	
	}
	else {
		System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
		System.out.println(jogador.nome +" você quer uma dica?");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
			System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você, ok? segue: "
			+ "Agora, as cores que sobraram são: \r\n "
				+ "Amarela \r\n"
					+ "Vermelha \r\n");
			
			System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				
			if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
				System.out.println("Se no ENEM tivesse essas ajudas não é mesmo?!! Vamos seguir o jogo.." );
					pontuacao = pontuacao + 5;		
			}else {
				System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
			}
		}
	
	System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
			

	

//_____________________________________________________________________________________________________________________________________//						
//Questão 5
	
	rodada++;//5
	System.out.println("Agora vamos para a rodada número " + rodada);

	System.out.println("");
	
	
	jogador.resposta = input.nextLine();	

	if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
		
		System.out.println("");
		pontuacao = pontuacao + 10;	
	}
	else {
		System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
		System.out.println(jogador.nome +" você quer uma dica?");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
			System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
			+ "Agora, as cores que sobraram são: \r\n "
				+ "Amarela \r\n"
					+ "Vermelha \r\n");
			
			System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				
			if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
				System.out.println("Acertar após ajuda também é um acerto.. saiba disso.. " );
					pontuacao = pontuacao + 5;		
			}else {
				System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário.");
			}
		}
	
	System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
		
	System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
	jogador.resposta = input.nextLine();	
	
	if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
		System.out.println("CURIOSIDADE");		
	}
	
	else {
		System.out.println("Tudo bem.. vamos para mais o desafio número 6");	
	}		
				
//_____________________________________________________________________________________________________________________________________//						
//Questão 6
	
	rodada++;//6
	System.out.println("Iniciando a rodada número " + rodada);
	
	System.out.println("");
	jogador.resposta = input.nextLine();	

	if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
		
		System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
		pontuacao = pontuacao + 10;	
	}
	else {
		System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
		System.out.println(jogador.nome +" você quer uma dica?");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
			System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
			+ "Agora, as cores que sobraram são: \r\n "
				+ "Amarela \r\n"
					+ "Vermelha \r\n");
			
			System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				
			if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
				System.out.println("UHULL, grande resposta. Vamos para a proxima questão" );
					pontuacao = pontuacao + 5;		
			}else {
				System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
			}
		}
	
	System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
		
	System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
	jogador.resposta = input.nextLine();	
	
	if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
		System.out.println("CURIOSIDADE");		
	}
	
	else {
		System.out.println("Tudo bem.. vamos para mais o desafio número 7");	
	}		
	
//_____________________________________________________________________________________________________________________________________//						
//Questão 7
	
	rodada++;//7
	System.out.println("Iniciando a rodada número " + rodada);
	
	System.out.println("");
	jogador.resposta = input.nextLine();	

	if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
		
		System.out.println(" ");
		pontuacao = pontuacao + 10;	
	}
	else {
		System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
		System.out.println(jogador.nome +" você quer uma dica?");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
			System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
			+ "Agora, as cores que sobraram são: \r\n "
				+ "Amarela \r\n"
					+ "Vermelha \r\n");
			
			System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				
			if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
				System.out.println("UHULL, grande resposta. Vamos para a proxima questão" );
					pontuacao = pontuacao + 5;		
			}else {
				System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
			}
		}
	
	System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
		
	System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
	jogador.resposta = input.nextLine();	
	
	if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
		System.out.println("CURIOSIDADE");		
	}
	
	else {
		System.out.println("Tudo bem.. vamos para mais o desafio número 3");	
	}		
	
//_____________________________________________________________________________________________________________________________________//						
//Questão 8
	rodada++;//7
	System.out.println("Iniciando a rodada número " + rodada);
	
	System.out.println("");
	jogador.resposta = input.nextLine();	

	if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
		
		System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
		pontuacao = pontuacao + 10;	
	}
	else {
		System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
		System.out.println(jogador.nome +" você quer uma dica?");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
			System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
			+ "Agora, as cores que sobraram são: \r\n "
				+ "Amarela \r\n"
					+ "Vermelha \r\n");
			
			System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				
			if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
				System.out.println("UHULL, grande resposta. Vamos para a proxima questão" );
					pontuacao = pontuacao + 5;		
			}else {
				System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
			}
		}
	
	System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
		
	System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
	jogador.resposta = input.nextLine();	
	
	if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
		System.out.println("CURIOSIDADE");		
	}
	
	else {
		System.out.println("Tudo bem.. vamos para mais o desafio número 3");	
	}						
//_____________________________________________________________________________________________________________________________________//						
//Questão 9
	rodada++;//9
	System.out.println("Iniciando a rodada número " + rodada);
	
	System.out.println(" ");
	jogador.resposta = input.nextLine();	

	if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
		
		System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
		pontuacao = pontuacao + 10;	
	}
	else {
		System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
		System.out.println(jogador.nome +" você quer uma dica?");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
			System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
			+ "Agora, as cores que sobraram são: \r\n "
				+ "Amarela \r\n"
					+ "Vermelha \r\n");
			
			System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				
			if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
				System.out.println("UHULL, grande resposta. Vamos para a proxima questão" );
					pontuacao = pontuacao + 5;		
			}else {
				System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
			}
		}
	
	System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
		
	System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
	jogador.resposta = input.nextLine();	
	
	if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
		System.out.println("CURIOSIDADE");		
	}
	
	else {
		System.out.println("Tudo bem.. vamos para mais o desafio número 3");	
	}		
				
//_____________________________________________________________________________________________________________________________________//						
//Questão 10
	
	rodada++;//10
	System.out.println("Iniciando a rodada número " + rodada);
	
	System.out.println(" ");
	jogador.resposta = input.nextLine();	

	if(jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {
		
		System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
		pontuacao = pontuacao + 10;	
	}
	else {
		System.out.println("Ops, parece que você errou " + jogador.nome + "\n");
		System.out.println(jogador.nome +" você quer uma dica?");
		jogador.resposta = input.nextLine();	
		
		if(jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
			System.out.println("Ok "+ jogador.nome +", vamos eliminar duas opções para você: "
			+ "Agora, as cores que sobraram são: \r\n "
				+ "Amarela \r\n"
					+ "Vermelha \r\n");
			
			System.out.println("Tente acertar novamente: ");
				jogador.resposta = input.nextLine();	
				
			if(jogador.resposta.equalsIgnoreCase(questao.getVermelha()))//Vermelha {
				System.out.println("UHULL, grande resposta. Vamos para a proxima questão" );
					pontuacao = pontuacao + 5;		
			}else {
				System.out.println("Opssss..  Você errou. Tudo bem, ainda existem mais nove questões até o fim do questionário. Vamos para a próxima..");
			}
		}
	
	System.out.println("Sua pontuação após a "+ rodada +"ª rodada é: "+ pontuacao);
		
	System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
	jogador.resposta = input.nextLine();	
	
	if(jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {	
		System.out.println("CURIOSIDADE");		
	}
	
	else {
		System.out.println("Tudo bem.. vamos para mais o desafio número 3");	
	}		

//_____________________________________________________________________________________________________________________________________//						
//Finalização
	if(pontuacao>100) {
		System.out.println("Parabéns, você conseguiu, as suas escolhas transformaram o planeta Terra em um lugar\r\n"
				+ "habitável novamente");
		
		}else if(pontuacao<=90 && pontuacao>=60 ) {
			System.out.println("Você conseguiu reduzir os impactos ambientais, porém não o suficiente para salvar o\r\n"
					+ "planeta, tente novamente");
			
				}else {
					System.out.println("Infelizmente suas escolhas mantiveram o planeta da forma que estava nos anos 3000,\r\n"
							+ "tente novamente");
				}

		System.out.println("Programa encerrado");
		
		input.close();
	}
}