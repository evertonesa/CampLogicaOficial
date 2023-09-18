/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 18-09-2023
 */

import java.util.Scanner;

public class BuscaNome {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[10];
        int n;
        String nome;

        System.out.println("Digite 10 nomes para serem guardados:");

        for (n = 0; n < nomes.length; n++) {
            nomes[n] = entrada.nextLine();
        }
        System.out.println("Por favor insira mais um nome: ");
        nome = entrada.nextLine();

        //Busca Linear

        boolean encontrou = false;

        for (n=0; n < nomes.length; n++){
            String elemento = nomes[n];
            if (elemento.equals(nome)){
                encontrou = true;
                break;
            }
        }
        if (encontrou){
            System.out.println("Achei");
        } else System.out.println("Nao achei");
    }
}
