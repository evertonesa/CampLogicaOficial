/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 19-09-2023
 */

import java.util.*;


public class ExcluirNome {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] nomes = new String[10];
        int n;

        System.out.println("Digite 20 nomes: ");

        for (n = 0; n < nomes.length; n++) {
            nomes[n] = entrada.nextLine();
        }

        nomes = new HashSet<>(Arrays.asList(nomes)).toArray(new String[0]);

        System.out.println("Retiradas as repeticoes, ficamos com a seguinte lista:");

        for (String str : nomes) {
            System.out.println(str);
        }
    }
}
