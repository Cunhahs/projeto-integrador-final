package br.com.senac.projetoIntegrador.projectFinal.principal;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Menu {

    /**
     * Método retorna um interio entre 1,2 e 3 Use esse retorno para executar as
     * ações respectivas
     *
     * Exemplo: retorna 1 que significa jogar então execute suas ações para
     * abrir o jogo
     *
     * @return int
     */
    public static int abrirMenu() {
        mostraTituloEmASC();
        mostraOpcoesDoMenu();
        int op = pegaEntrada();
        if (op == 2) {
            mostraCredito();
            op = abrirMenu();
        }
        return op;
    }

    private static int pegaEntrada() {
        Scanner entrada = new Scanner(System.in);
        int op;
        System.out.println("Digite: ");
        try{
            op = entrada.nextInt();
            if (op > 3 || op <= 0) {
                throw new IllegalStateException("Valor inválido");
            }
            return op;
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido tente novamente!");
            return pegaEntrada();
        } catch (NoSuchElementException e) {
            System.out.println("Valor inválido tente novamente!");
            return pegaEntrada();
        } catch (IllegalStateException e) {
            System.out.println("Valor inválido tente novamente!");
            return pegaEntrada();
        }
    }

    private static void mostraOpcoesDoMenu() {
        System.out.println("");
        System.out.println("");
        System.out.println("*------------------------MENU-----------------------*");

        System.out.println("1 - Jogar");
        System.out.println("2 - Créditos");
        System.out.println("3 - Sair");
    }

    private static void mostraTituloEmASC() {
        System.out.println(
                "                .__                          \n"
                + "  ___________   |  | ___  __  ____     ____  \n"
                + " /  ___/\\__  \\  |  | \\  \\/ /_/ __ \\   /  _ \\ \n"
                + " \\___ \\  / __ \\_|  |__\\   / \\  ___/  (  <_> )\n"
                + "/____  >(____  /|____/ \\_/   \\___  >  \\____/ \n"
                + "     \\/      \\/                  \\/          \n"
                + "        .__                            __          ._.\n"
                + "______  |  |  _____     ____    ____ _/  |_ _____  | |\n"
                + "\\____ \\ |  |  \\__  \\   /    \\ _/ __ \\\\   __\\\\__  \\ | |\n"
                + "|  |_> >|  |__ / __ \\_|   |  \\\\  ___/ |  |   / __ \\_\\|\n"
                + "|   __/ |____/(____  /|___|  / \\___  >|__|  (____  /__\n"
                + "|__|               \\/      \\/      \\/            \\/ \\/"
        );
    }

    private static void mostraCredito() {
        System.out.println("\n\nDesnvolvedores: ");
        System.out.println("Camilla Silva Carneiro");
        System.out.println("Henrique Cunha de Souza");
        System.out.println("José Ramalho da Silva neto");
        System.out.println("William Guilherme Kuntzler Schmitt");
        System.out.println("Michael Lima dos Santos\n\n");
    }
}
