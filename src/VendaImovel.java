/**
 * Desafio do Camp db - Venda Imóvel
 * @autor Everton Santos
 * @versão 1.0
 * @Data 12-09-2023
 */

import java.util.Scanner;


public class VendaImovel {

    String nome;
    double valor, comissao;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Informe por quanto vendeu o Imovel:");
        double valor = entrada.nextDouble();

        if (valor >= 50000) {
            double  comissao = valor * 0.2;
            System.out.printf(nome + ", O valor do imovel vendido foi R$%.2f: Sua comissao e: R$%.2f \n", valor,comissao);
        } else {
            double comissao;
            if (valor > 30000) {
                comissao = valor * 0.15;
            } else {
                comissao = valor * 0.10;
            }
            System.out.printf(nome + ", O valor do imovel vendido foi R$%.2f: Sua comissao e: R$%.2f \n", valor,comissao);
        }
    }
}

