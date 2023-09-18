/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 17-09-2023
 */

import java.util.Scanner;

public class ValoresImpares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        int[] v = new int[10];
        int i;
        int impar=0;

        System.out.println("Vamos montar um vetor de 10 posicoes, por favor digite os numeros inteiros:");

        for(i=0; i<v.length;i++){
            v[i] = entrada.nextInt();
            if(v[i]%2!=0){
                impar=impar+1;
            }
        }
        System.out.println("No total temos " + impar + " numeros impares." );
    }
}

