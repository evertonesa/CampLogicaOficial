/**
 * Desafio do Camp db - Calculadora
 * @autor Everton Santos
 * @versão 1.0
 * @Data 06-09-2023
 */

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valor1, valor2, valor3;
        int cont;

        System.out.println("Informe o primeiro valor: ");
        valor1 = entrada.nextDouble();

        System.out.println("Informe o segundo valor: ");
        valor2 = entrada.nextDouble();

        System.out.println("Informe qual operacao deseja realizar:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtracao");
        System.out.println("3 - Multiplicacao");
        System.out.println("4 - Divisao");

        cont = entrada.nextInt();

        switch (cont) {
            case 1 -> {
                valor3 = valor1 + valor2;
                System.out.println("O Resultado final da soma e: " + valor3);
            }
            case 2 -> {
                valor3 = valor1 - valor2;
                System.out.println("O resultado final da subtracao e: " + valor3);
            }

            case 3 -> {
                valor3 = valor1 * valor2;
                System.out.println("O Resultado final da multiplicacao e: " + valor3);
            }

            case 4 -> {
                valor3 = valor1 / valor2;
                System.out.println("O resultado da sua divisao e: " + valor3);
            }

            default -> System.out.println("Informe um valor valido!");
        }
    }
}
