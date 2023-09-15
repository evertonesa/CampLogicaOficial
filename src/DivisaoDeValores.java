/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 15-09-2023
 */

import java.util.Scanner;

public class DivisaoDeValores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int a, b;
        double result;
        String resp;


        System.out.println("Vamos realizar uma divisao:");
        System.out.println("Informe um valor para o numerador: ");
        a = entrada.nextInt();


        do {
            System.out.println("Informe um valor para o denominador: ");
            b = entrada.nextInt();

            if (b != 0){
                result = (double) a/b;
                System.out.println("O Reusltado da divisao e: " + result);
                break;
            } else{
                System.out.println("Nao e possivel realizar divisao por 0");
            }
            System.out.println("Deseja continuar a divisao? [S/N] ");
            resp = entrada.next();
            System.out.println("O denominador precisa ser diferente de 0, fique atento");
        } while (resp.equals("S"));

    }
}
