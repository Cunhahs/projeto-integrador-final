package br.com.senac.projetoIntegrador.projectFinal.principal;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Iniciando Scanner para obter respostas do jogador		
        Scanner input = new Scanner(System.in);

        if (Menu.abrirMenu(input) == 1) jogar(input);
    }

    private static void jogar(Scanner input) {
        //na classe player
        Player jogador = new Player();
        
        //Iniciando questoes na classe principal		
        Questoes questao = new Questoes();

        //Iniciando s�rie de pontua��o	
        int pontuacao = 0;

        //Sinalizador de rodadas 
        int rodada = 0;
        
        //Inicio Programa
        System.out.println("Por favor, digite seu nome: ");

        jogador.nome = input.nextLine();
        System.out.println("Ok " + jogador.nome + " Vamos iniciar o jogo.. \r\n");

        //Iniciando Jogo
        System.out.println(
                "Voc� foi congelado e acordou no ano 3000, ao ler algumas not�cias voc� percebe que a humanidade\r\n"
                + "entrou em extin��o por causa da polui��o do meio ambiente e ent�o vagando pela cidade. Voc�\r\n"
                + "encontra um antigo laborat�rio e lembra que voc� havia lido sobre ele no jornal. O laborat�rio tinha\r\n"
                + "como prop�sito enviar algu�m para o passado para que pudesse mudar esse cen�rio. Voc� ent�o\r\n"
                + "passa alguns dias tentando entender como essa m�quina funciona quando finalmente uma luz\r\n"
                + "acende.\r\n \r\n" + "Voc� entra em t�nel�\r\n \r\n"
                + "BEM VINDO. VOC� EST� NO ANO DE 2021! SUA MISS�O � SALVAR O PLANETA TERRA !!!\r\n\r\n"
                + "Voc� escuta isso e, ainda meio zonzo da viagem,  acha um papel perto\r\n"
                + "do seu p�, ao ler descobre como agir para salvar o planeta.\r\n\r\n"
                + "�Sua miss�o � ajudar os habitantes locais atrav�s da conscientiza��o. Tudo o que for dito por voc�\r\n"
                + "ser� divulgado a todos na terra, ent�o responda com CUIDADO!�\r\n\r\n"
                + "Ao chegar, voc� encontra com algumas pessoas que est�o limpando sua casa depois de uma\r\n"
                + "festa, eles est�o jogando todos os lixos no mesmo lugar.. Come�e a salvar o planeta.. \r\n");

        //Quest�o 1
        rodada++;
        System.out.println("1) Qual o lixo para descarte para as garrafas de vidro? \r\n" + "vermelha \r\n"
                + "azul \r\n" + "verde \r\n" + "amarela \r\n\r\n" + "Escreva cor correta: \r\n");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getVerde())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as cores que sobraram s�o:\r\n " + "verde \r\n" + "amarela \r\n");
                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getVerde()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println(
                            "Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n" + "vermelha \r\n"
                            + "azul \r\n" + "verde \r\n" + "amarela \r\n" + "Escreva a cor correta: \r\n");
                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getVerde())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//
        //Quest�o 2
        rodada++;

        System.out.println("E para as latas de cerveja? Qual a cor certa do lixo? "
                + "amarela \r\n"
                + "cinza \r\n"
                + "vermelha \r\n"
                + "azul \r\n\r\n"
                + "Escreva cor correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAmarela())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as cores que sobraram s�o:\r\n "
                            + "Cinza \r\n"
                            + "Amarela \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAmarela()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + "amarela \r\n" + "cinza \r\n" + "vermelha \r\n" + "azul \r\n\r\n"
                            + "Escreva cor correta: \r\n");
                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAmarela())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        //_____________________________________________________________________________________________________________________________________//		
        //Quest�o 3
        rodada++;// 3

        System.out.println("Qual a seguir � o lixo correto para os copos pl�sticos?" + "Marrom \r\n" + "Vermelha \r\n"
                + "Amarela \r\n" + "Verde \r\n\r\n" + "Escreva cor correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as cores que sobraram s�o:\r\n "
                            + "Marrom \r\n"
                            + "Vermelha \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getVermelha()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + "Marrom \r\n"
                            + "Vermelha \r\n"
                            + "Amarela \r\n"
                            + "Verde \r\n\r\n"
                            + "Escreva cor correta: \r\n");
                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        //_____________________________________________________________________________________________________________________________________//
        //Quest�o 4
        rodada++;// 4

        System.out.println("Quais s�o os 3 'r's do meio ambiente? \r\n"
                + " A) Reciclar, Reabastecer e Reutilizar \r\n"
                + "B) Reutilizar, Reinventar e Racionar \r\n"
                + "C) Reciclar, Reutilizar e Reduzir \r\n"
                + "D) Reduzir, Racionar e Reciclar \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as alternativas que sobraram s�o:\r\n "
                            + "B) Reutilizar, Reinventar e Racionar \r\n"
                            + "C) Reciclar, Reutilizar e Reduzir \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + " A) Reciclar, Reabastecer e Reutilizar \r\n"
                            + "B) Reutilizar, Reinventar e Racionar \r\n"
                            + "C) Reciclar, Reutilizar e Reduzir \r\n"
                            + "D) Reduzir, Racionar e Reciclar \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        //_____________________________________________________________________________________________________________________________________//						
        //Quest�o 5
        rodada++;// 5

        System.out.println("A pecu�ria bovina � respons�vel pela emiss�o de pelo menos 50% dos gases-estufa.\r\n"
                + "Quais s�o eles?\r\n"
                + " A) G�s carb�nico e metano \r\n"
                + "B) Oxig�nio e enxofre \r\n"
                + "C) Hidr�genio e xen�nio \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as alternativas que sobraram s�o:\r\n "
                            + " A) G�s carb�nico e metano \r\n"
                            + "B) Oxig�nio e enxofre \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + " A) G�s carb�nico e metano \r\n"
                            + "B) Oxig�nio e enxofre \r\n"
                            + "C) Hidr�genio e xen�nio \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Quest�o 6
        rodada++;// 6	

        System.out.println(") No ano 3000, as geleiras da Ant�rtida est�o derretidas, causando uma grande\r\n"
                + "inunda��o, destruindo vilarejos ao seu redor, o que poderia ser feito hoje para evitar\r\n"
                + "essa cat�strofe natural? \r\n"
                + " A) Redu��o do gado \r\n"
                + "B) Plantio em massa \r\n"
                + "C) Diminui��o de resid�ncias \r\n"
                + "D) A��es preventivas com efeito global e seus danos \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as alternativas que sobraram s�o:\r\n "
                            + "C) Diminui��o de resid�ncias \r\n"
                            + "D) A��es preventivas com efeito global e seus danos \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + " A) Redu��o do gado \r\n"
                            + "B) Plantio em massa \r\n"
                            + "C) Diminui��o de resid�ncias \r\n"
                            + "D) A��es preventivas com efeito global e seus danos \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Quest�o 7
        rodada++;// 7

        System.out.println("Tendo em mente que cidades costeiras no ano 3000 foram completamente inundadas,\r\n"
                + "agora temos uma quest�o que ser� essencial para todos os governantes.\r\n"
                + "Qual o principal g�s que deve ser diminu�do a sua emiss�o para que n�o ocorra um\r\n"
                + "aumento da temperatura do planeta: \r\n"
                + " A) Carbono \r\n"
                + "B) Metano \r\n"
                + "C) L�tio \r\n"
                + "D) Hidrog�nio \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as alternativas que sobraram s�o:\r\n "
                            + " A) Carbono \r\n"
                            + "B) Metano \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + " A) Carbono \r\n"
                            + "B) Metano \r\n"
                            + "C) L�tio \r\n"
                            + "D) Hidrog�nio \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Quest�o 8
        rodada++;// 8

        System.out.println("Quais das alternativas abaixo s�o alternativas que ajudam a diminuir o efeito estufa ? \r\n"
                + " A)Reciclar, n�o usar lava lou�as, usar s� l�mpada incandescente \r\n"
                + "B)Andar de carro, evitar transportes coletivos \r\n"
                + "C)Diminuir o consumo de energia el�trica e andar mais de carro para deixar o\r\n"
                + "transporte p�blico mais vazio \r\n"
                + "D)Andar de bicicleta, evitar usar carro, diminuir o uso de energia el�trica e consumo de\r\n"
                + "carne \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as alternativas que sobraram s�o:\r\n "
                            + " A)Reciclar, n�o usar lava lou�as, usar s� l�mpada incandescente \r\n"
                            + "D)Andar de bicicleta, evitar usar carro, diminuir o uso de energia el�trica e consumo de\r\n"
                            + "carne \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + " A)Reciclar, n�o usar lava lou�as, usar s� l�mpada incandescente \r\n"
                            + "B)Andar de carro, evitar transportes coletivos \r\n"
                            + "C)Diminuir o consumo de energia el�trica e andar mais de carro para deixar o\r\n"
                            + "transporte p�blico mais vazio \r\n"
                            + "D)Andar de bicicleta, evitar usar carro, diminuir o uso de energia el�trica e consumo de\r\n"
                            + "carne \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Quest�o 9
        rodada++;// 9

        System.out.println("Quais os gases que, caso n�o sejam diminu�dos nos pr�ximos anos ir�o fazer com que o\r\n"
                + "efeito estufa aumente de maneira prejudicial?  \r\n"
                + " A)Oxig�nio e Nitrog�nio Carbono\r\n"
                + "B)Oxig�nio e Sulfato de B�rio\r\n"
                + "C)Di�xido de Carbono e metano\r\n"
                + "D)Oxig�nio e Di�xido de Carbono\r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as alternativas que sobraram s�o:\r\n "
                            + "C)Di�xido de Carbono e metano\r\n"
                            + "D)Oxig�nio e Di�xido de Carbono\r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + " A)Oxig�nio e Nitrog�nio Carbono\r\n"
                            + "B)Oxig�nio e Sulfato de B�rio\r\n"
                            + "C)Di�xido de Carbono e metano\r\n"
                            + "D)Oxig�nio e Di�xido de Carbono\r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Quest�o 10
        rodada++;// 10

        System.out.println("Quais s�o as consequ�ncias do efeito estufa ? \r\n"
                + " A)Aumento da temperatura degelo aumento do n�vel do mar \r\n"
                + "B)O efeito estufa s� traz coisas boas para humanidade \r\n"
                + "C)O aumento de gases pesados e morte das ol� das gerando me os oxig�nio \r\n"
                + "D)Nenhuma das alternativas\r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

            System.out.println("Parab�ns, j� vi que a popula��o est� em boas m�os, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que voc� errou " + jogador.nome);
            System.out.println(jogador.nome + " voc� quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas op��es para voc�: "
                            + "Agora, as alternativas que sobraram s�o:\r\n "
                            + " A)Aumento da temperatura degelo aumento do n�vel do mar \r\n"
                            + "C)O aumento de gases pesados e morte das ol� das gerando me os oxig�nio \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima quest�o");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, ent�o tenta novamente. Lembrando, as alternativas s�o : \n"
                            + " A)Aumento da temperatura degelo aumento do n�vel do mar \r\n"
                            + "B)O efeito estufa s� traz coisas boas para humanidade \r\n"
                            + "C)O aumento de gases pesados e morte das ol� das gerando me os oxig�nio \r\n"
                            + "D)Nenhuma das alternativas\r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

                        System.out.println("a ajuda facilitou um pouco n� ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. n�o foi dessa vez n�?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a pr�xima");
            }
        }

        System.out.println("Sua pontua��o ap�s a " + rodada + "� rodada � de: " + pontuacao + " pontos");

        System.out.println("Voc� gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda est� por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Finaliza��o
        if (pontuacao == 100) {
            System.out
                    .println("Parab�ns, voc� conseguiu, as suas escolhas transformaram o planeta Terra em um lugar\r\n"
                            + "habit�vel novamente");

        } else if (pontuacao <= 90 && pontuacao >= 60) {
            System.out.println("Voc� conseguiu reduzir os impactos ambientais, por�m n�o o suficiente para salvar o\r\n"
                    + "planeta, tente novamente");

        } else {
            System.out.println("Infelizmente suas escolhas mantiveram o planeta da forma que estava nos anos 3000,\r\n"
                    + "tente novamente");
        }

        System.out.println("Programa encerrado");
        input.close();
    }
}
