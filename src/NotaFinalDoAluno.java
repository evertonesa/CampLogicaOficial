/**
 * Desafio do Camp db - Nota Final do Aluno
 * @autor Everton Santos
 * @versão 1.0
 * @Data 31-08-2023
 */

import java.util.Scanner;

public class NotaFinalDoAluno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1, nota2, nota3;
        float media;

        //Entrada de Dados
        System.out.print("Digite o nome do Aluno: ");
        String nome = entrada.nextLine();
        System.out.println("Digite a primeira nota entre [0.0 e 10.0] de " + nome);
        nota1 = entrada.nextFloat();
        System.out.println("Digite a segunda nota entre [0.0 e 10.0] de " + nome);
        nota2 = entrada.nextFloat();
        System.out.println("Digite a terceira nota entre [0.0 e 10.0] de " + nome);
        nota3 = entrada.nextFloat();

        //Calculando a Média
        media = (nota1 + nota2 + nota3)/3;
        System.out.printf("A media de %s e: %.2f\n", nome, media );

        if( (media <= 10.0) && (media >= 0.0) ){
            if( media >= 7.0 ){
                System.out.println("Parabéns, você passou direto");
            }
            else {
                if( media >= 5.0 ){
                    System.out.println("Voce tera que fazer final, bons estudos");
                }
                else {
                    System.out.println("Infelizmente voce foi reprovado?");
                }
            }
        }
        else {
            System.out.println("Nota invalida, fechando aplicativo");
        }
    }
}
