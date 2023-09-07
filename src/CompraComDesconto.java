/**
 * Desafio do Camp db - Compra Com Desconto
 * @autor Everton Santos
 * @versão 1.0
 * @Data 07-09-2023
 */

import java.util.Scanner;

public class CompraComDesconto {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double valorproduto = 0, valortotal, desconto, valorcdesconto;
        String item = "";
        int escolha, quantitens;

        System.out.println("Estes sao os itens e seus respctivos precos no Mercado CampDB:");
        System.out.println("----------------------------------------------------------------");
        System.out.println("1 - Item: Biscoito - Preco R$: 2.00");
        System.out.println("2 - Item: Chocolate - Preco R$: 5.00");
        System.out.println("3 - Item: Macarrao Instataneo - Preco R$: 3.00");
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Qual item deseja comprar da lista mencionada anteriormente? ");


        //Escolha dos itens
        escolha = entrada.nextInt();


        switch (escolha) {
            case 1:
                valorproduto = Double.parseDouble("2.00");
                item = "Biscoito";
                System.out.println("Sua escolha foi " + item + ", a unidade sai por R$ " + valorproduto);
                break;
            case 2:
                valorproduto = Double.parseDouble("5.00");
                item = "Chocolate";
                System.out.println("Sua escolha foi " + item + ", a unidade sai por R$ " + valorproduto);
                break;
            case 3:
                valorproduto = Double.parseDouble("3.00");
                item = "Macarrao Instantaneo";
                System.out.println("Sua escolha foi " + item + ", a unidade sai por R$ " + valorproduto);
                break;
            default:
                System.out.println("Opcao invalida, escolha uma opcao valida.");
                System.exit(0);
        }

        //Escolha da quantidade de unidades do item
        System.out.println("Quantas unidades voce quer do item escolhido?");
        System.out.println("----------------------------------------------------------------");
        System.out.println("Menos que 10 unidades: Sem desconto");
        System.out.println("De 11 a 20 unidades: 10% de desconto");
        System.out.println("De 21 a 50 unidades: 20% de desconto");
        System.out.println("Mais de 50 Unidades: 25% de desconto");
        System.out.println("----------------------------------------------------------------");
        quantitens = entrada.nextInt();

        //Calculo

        valortotal = valorproduto * quantitens;
        if (quantitens <= 10) {
            System.out.println("O valor da compra de " + quantitens + " unidades" + " de " + item + " sai por R$" + valortotal);
            System.out.println("Obrigado pela prefeencia, volte sempre :)");
        } else {
            if (quantitens <= 20){
                desconto = valortotal * 0.1;
                valorcdesconto = valortotal - desconto;
                System.out.println("O valor da compra de " + quantitens + " unidades" + " de " + item + " sai por R$" + valorcdesconto + " (Voce teve 10% de desconto)");
                System.out.println("Obrigado pela prefeencia, volte sempre :)");
            } else {
                if (quantitens <= 50){
                    desconto = valortotal * 0.2;
                    valorcdesconto = valortotal - desconto;
                    System.out.println("O valor da compra de " + quantitens + " unidades" + " de " + item + " sai por R$" + valorcdesconto + " (Voce teve 20% de desconto)");
                    System.out.println("Obrigado pela prefeencia, volte sempre :)");
                } else {
                    desconto = valortotal * 0.25;
                    valorcdesconto = valortotal - desconto;
                    System.out.println("O valor da compra de " + quantitens + " unidades" + " de " + item + " sai por R$" + valorcdesconto + " (Voce teve 25% de desconto)");
                    System.out.println("Obrigado pela prefeencia, volte sempre :)");
                }
            }
        }
    }
}
