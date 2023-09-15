/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 14-09-2023
 */

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num, multi = 0, resultado;

        System.out.println("Digite um numero inteiro entre 1 e 10: ");
        num = entrada.nextInt();


        while (num < 1 || num > 10) {
            System.out.println("Digite um numero dentro do intervalo!");
            num = entrada.nextInt();
        } while (multi <= 10) {
                resultado = num * multi;
                System.out.println(resultado);
                multi++;
        }
    }
}
