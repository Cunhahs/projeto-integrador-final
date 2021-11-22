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

        //Iniciando série de pontuação	
        int pontuacao = 0;

        //Sinalizador de rodadas 
        int rodada = 0;
        
        //Inicio Programa
        System.out.println("Por favor, digite seu nome: ");

        jogador.nome = input.nextLine();
        System.out.println("Ok " + jogador.nome + " Vamos iniciar o jogo.. \r\n");

        //Iniciando Jogo
        System.out.println(
                "Você foi congelado e acordou no ano 3000, ao ler algumas notícias você percebe que a humanidade\r\n"
                + "entrou em extinção por causa da poluição do meio ambiente e então vagando pela cidade. Você\r\n"
                + "encontra um antigo laboratório e lembra que você havia lido sobre ele no jornal. O laboratório tinha\r\n"
                + "como propósito enviar alguém para o passado para que pudesse mudar esse cenário. Você então\r\n"
                + "passa alguns dias tentando entender como essa máquina funciona quando finalmente uma luz\r\n"
                + "acende.\r\n \r\n" + "Você entra em túnel…\r\n \r\n"
                + "BEM VINDO. VOCÊ ESTÁ NO ANO DE 2021! SUA MISSÃO É SALVAR O PLANETA TERRA !!!\r\n\r\n"
                + "Você escuta isso e, ainda meio zonzo da viagem,  acha um papel perto\r\n"
                + "do seu pé, ao ler descobre como agir para salvar o planeta.\r\n\r\n"
                + "“Sua missão é ajudar os habitantes locais através da conscientização. Tudo o que for dito por você\r\n"
                + "será divulgado a todos na terra, então responda com CUIDADO!”\r\n\r\n"
                + "Ao chegar, você encontra com algumas pessoas que estão limpando sua casa depois de uma\r\n"
                + "festa, eles estão jogando todos os lixos no mesmo lugar.. Começe a salvar o planeta.. \r\n");

        //Questão 1
        rodada++;
        System.out.println("1) Qual o lixo para descarte para as garrafas de vidro? \r\n" + "vermelha \r\n"
                + "azul \r\n" + "verde \r\n" + "amarela \r\n\r\n" + "Escreva cor correta: \r\n");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getVerde())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as cores que sobraram são:\r\n " + "verde \r\n" + "amarela \r\n");
                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getVerde()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println(
                            "Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n" + "vermelha \r\n"
                            + "azul \r\n" + "verde \r\n" + "amarela \r\n" + "Escreva a cor correta: \r\n");
                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getVerde())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//
        //Questão 2
        rodada++;

        System.out.println("E para as latas de cerveja? Qual a cor certa do lixo? "
                + "amarela \r\n"
                + "cinza \r\n"
                + "vermelha \r\n"
                + "azul \r\n\r\n"
                + "Escreva cor correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAmarela())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as cores que sobraram são:\r\n "
                            + "Cinza \r\n"
                            + "Amarela \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAmarela()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + "amarela \r\n" + "cinza \r\n" + "vermelha \r\n" + "azul \r\n\r\n"
                            + "Escreva cor correta: \r\n");
                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAmarela())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        //_____________________________________________________________________________________________________________________________________//		
        //Questão 3
        rodada++;// 3

        System.out.println("Qual a seguir é o lixo correto para os copos plásticos?" + "Marrom \r\n" + "Vermelha \r\n"
                + "Amarela \r\n" + "Verde \r\n\r\n" + "Escreva cor correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as cores que sobraram são:\r\n "
                            + "Marrom \r\n"
                            + "Vermelha \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getVermelha()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + "Marrom \r\n"
                            + "Vermelha \r\n"
                            + "Amarela \r\n"
                            + "Verde \r\n\r\n"
                            + "Escreva cor correta: \r\n");
                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getVermelha())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        //_____________________________________________________________________________________________________________________________________//
        //Questão 4
        rodada++;// 4

        System.out.println("Quais são os 3 'r's do meio ambiente? \r\n"
                + " A) Reciclar, Reabastecer e Reutilizar \r\n"
                + "B) Reutilizar, Reinventar e Racionar \r\n"
                + "C) Reciclar, Reutilizar e Reduzir \r\n"
                + "D) Reduzir, Racionar e Reciclar \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as alternativas que sobraram são:\r\n "
                            + "B) Reutilizar, Reinventar e Racionar \r\n"
                            + "C) Reciclar, Reutilizar e Reduzir \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + " A) Reciclar, Reabastecer e Reutilizar \r\n"
                            + "B) Reutilizar, Reinventar e Racionar \r\n"
                            + "C) Reciclar, Reutilizar e Reduzir \r\n"
                            + "D) Reduzir, Racionar e Reciclar \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        //_____________________________________________________________________________________________________________________________________//						
        //Questão 5
        rodada++;// 5

        System.out.println("A pecuária bovina é responsável pela emissão de pelo menos 50% dos gases-estufa.\r\n"
                + "Quais são eles?\r\n"
                + " A) Gás carbônico e metano \r\n"
                + "B) Oxigênio e enxofre \r\n"
                + "C) Hidrôgenio e xenónio \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as alternativas que sobraram são:\r\n "
                            + " A) Gás carbônico e metano \r\n"
                            + "B) Oxigênio e enxofre \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + " A) Gás carbônico e metano \r\n"
                            + "B) Oxigênio e enxofre \r\n"
                            + "C) Hidrôgenio e xenónio \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Questão 6
        rodada++;// 6	

        System.out.println(") No ano 3000, as geleiras da Antártida estão derretidas, causando uma grande\r\n"
                + "inundação, destruindo vilarejos ao seu redor, o que poderia ser feito hoje para evitar\r\n"
                + "essa catástrofe natural? \r\n"
                + " A) Redução do gado \r\n"
                + "B) Plantio em massa \r\n"
                + "C) Diminuição de residências \r\n"
                + "D) Ações preventivas com efeito global e seus danos \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as alternativas que sobraram são:\r\n "
                            + "C) Diminuição de residências \r\n"
                            + "D) Ações preventivas com efeito global e seus danos \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + " A) Redução do gado \r\n"
                            + "B) Plantio em massa \r\n"
                            + "C) Diminuição de residências \r\n"
                            + "D) Ações preventivas com efeito global e seus danos \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Questão 7
        rodada++;// 7

        System.out.println("Tendo em mente que cidades costeiras no ano 3000 foram completamente inundadas,\r\n"
                + "agora temos uma questão que será essencial para todos os governantes.\r\n"
                + "Qual o principal gás que deve ser diminuído a sua emissão para que não ocorra um\r\n"
                + "aumento da temperatura do planeta: \r\n"
                + " A) Carbono \r\n"
                + "B) Metano \r\n"
                + "C) Lítio \r\n"
                + "D) Hidrogênio \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as alternativas que sobraram são:\r\n "
                            + " A) Carbono \r\n"
                            + "B) Metano \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + " A) Carbono \r\n"
                            + "B) Metano \r\n"
                            + "C) Lítio \r\n"
                            + "D) Hidrogênio \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Questão 8
        rodada++;// 8

        System.out.println("Quais das alternativas abaixo são alternativas que ajudam a diminuir o efeito estufa ? \r\n"
                + " A)Reciclar, não usar lava louças, usar só lâmpada incandescente \r\n"
                + "B)Andar de carro, evitar transportes coletivos \r\n"
                + "C)Diminuir o consumo de energia elétrica e andar mais de carro para deixar o\r\n"
                + "transporte público mais vazio \r\n"
                + "D)Andar de bicicleta, evitar usar carro, diminuir o uso de energia elétrica e consumo de\r\n"
                + "carne \r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as alternativas que sobraram são:\r\n "
                            + " A)Reciclar, não usar lava louças, usar só lâmpada incandescente \r\n"
                            + "D)Andar de bicicleta, evitar usar carro, diminuir o uso de energia elétrica e consumo de\r\n"
                            + "carne \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + " A)Reciclar, não usar lava louças, usar só lâmpada incandescente \r\n"
                            + "B)Andar de carro, evitar transportes coletivos \r\n"
                            + "C)Diminuir o consumo de energia elétrica e andar mais de carro para deixar o\r\n"
                            + "transporte público mais vazio \r\n"
                            + "D)Andar de bicicleta, evitar usar carro, diminuir o uso de energia elétrica e consumo de\r\n"
                            + "carne \r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaD())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Questão 9
        rodada++;// 9

        System.out.println("Quais os gases que, caso não sejam diminuídos nos próximos anos irão fazer com que o\r\n"
                + "efeito estufa aumente de maneira prejudicial?  \r\n"
                + " A)Oxigênio e Nitrogênio Carbono\r\n"
                + "B)Oxigênio e Sulfato de Bário\r\n"
                + "C)Dióxido de Carbono e metano\r\n"
                + "D)Oxigênio e Dióxido de Carbono\r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as alternativas que sobraram são:\r\n "
                            + "C)Dióxido de Carbono e metano\r\n"
                            + "D)Oxigênio e Dióxido de Carbono\r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + " A)Oxigênio e Nitrogênio Carbono\r\n"
                            + "B)Oxigênio e Sulfato de Bário\r\n"
                            + "C)Dióxido de Carbono e metano\r\n"
                            + "D)Oxigênio e Dióxido de Carbono\r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaC())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Questão 10
        rodada++;// 10

        System.out.println("Quais são as consequências do efeito estufa ? \r\n"
                + " A)Aumento da temperatura degelo aumento do nível do mar \r\n"
                + "B)O efeito estufa só traz coisas boas para humanidade \r\n"
                + "C)O aumento de gases pesados e morte das olá das gerando me os oxigênio \r\n"
                + "D)Nenhuma das alternativas\r\n"
                + "Escolha a alternativa correta: \r\n");

        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

            System.out.println("Parabéns, já vi que a população está em boas mãos, vamos para mais uma!");
            pontuacao = pontuacao + 10;
        } else {
            System.out.println("Ops, parece que você errou " + jogador.nome);
            System.out.println(jogador.nome + " você quer tentar novamente? ");
            jogador.resposta = input.nextLine();

            if (jogador.resposta.equalsIgnoreCase(questao.getNovamente())) {

                System.out.println("gostaria de eliminar duas alternativas para aumentar suas chances?");
                jogador.resposta = input.nextLine();

                if (jogador.resposta.equalsIgnoreCase(questao.getAjuda())) {
                    System.out.println("Ok " + jogador.nome + ", vamos eliminar duas opções para você: "
                            + "Agora, as alternativas que sobraram são:\r\n "
                            + " A)Aumento da temperatura degelo aumento do nível do mar \r\n"
                            + "C)O aumento de gases pesados e morte das olá das gerando me os oxigênio \r\n");

                    System.out.println("Tente acertar novamente: ");
                    jogador.resposta = input.nextLine();
                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA()))// verde {
                    {
                        System.out.println("UHULL, grande resposta. Vamos para a proxima questão");
                    }
                    pontuacao = pontuacao + 5;
                } else {
                    System.out.println("Tudo bem, então tenta novamente. Lembrando, as alternativas são : \n"
                            + " A)Aumento da temperatura degelo aumento do nível do mar \r\n"
                            + "B)O efeito estufa só traz coisas boas para humanidade \r\n"
                            + "C)O aumento de gases pesados e morte das olá das gerando me os oxigênio \r\n"
                            + "D)Nenhuma das alternativas\r\n"
                            + "Escolha a alternativa correta: \r\n");

                    jogador.resposta = input.nextLine();

                    if (jogador.resposta.equalsIgnoreCase(questao.getAlternativaA())) {

                        System.out.println("a ajuda facilitou um pouco né ? grande resposta!");
                        pontuacao = pontuacao + 7;
                    } else {
                        System.out.println("Ops.. não foi dessa vez né?");
                    }
                }
            } else {
                System.out.println("Tudo bem, vamos para a próxima");
            }
        }

        System.out.println("Sua pontuação após a " + rodada + "ª rodada é de: " + pontuacao + " pontos");

        System.out.println("Você gostaria de conhecer uma curiosidade sobre o assunto no momento? ");
        jogador.resposta = input.nextLine();

        if (jogador.resposta.equalsIgnoreCase(questao.getCuriosidade())) {

            System.out.println("o vidro demora cerca de 4 mil anos para se decompor, o que\r\n"
                    + "significa que o primeiro vidro da terra ainda está por aqui! \r\n");
        } else {
            System.out.println("Tudo bem.. vamos para mais um desafio");
        }

        //_____________________________________________________________________________________________________________________________________//						
        //Finalização
        if (pontuacao == 100) {
            System.out
                    .println("Parabéns, você conseguiu, as suas escolhas transformaram o planeta Terra em um lugar\r\n"
                            + "habitável novamente");

        } else if (pontuacao <= 90 && pontuacao >= 60) {
            System.out.println("Você conseguiu reduzir os impactos ambientais, porém não o suficiente para salvar o\r\n"
                    + "planeta, tente novamente");

        } else {
            System.out.println("Infelizmente suas escolhas mantiveram o planeta da forma que estava nos anos 3000,\r\n"
                    + "tente novamente");
        }

        System.out.println("Programa encerrado");
        input.close();
    }
}
