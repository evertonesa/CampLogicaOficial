/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 16-09-2023
 */

import java.util.Scanner;

public class MediaDoAluno {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double nota1, nota2, media;
        String nome, resp;

        do{
            System.out.println("Vamos calcular a media do seu aluno");
            System.out.println("Qual o nome do aluno");
            nome = entrada.next();
            System.out.println("Informe a primeira nota:");
            nota1 = entrada.nextDouble();
            System.out.println("Informe a segunda nota");
            nota2 = entrada.nextDouble();

            media = (nota1+nota2)/2;

            if (media >= 7){
                System.out.println(nome + " foi aprovado com media: " + media);
            } else {
                System.out.println(nome + " foi reprovado com media: " + media);
            }
            System.out.println("Deseja realizar mais alguma media? [S/N]");
            resp = entrada.next();
        }while (resp.equals("S"));
    }
}
