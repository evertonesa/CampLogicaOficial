/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 14-09-2023
 */


public class SomaDeValores {

    public static void main(String[] args) {

        int soma =0 , x = 0;

        while (x <= 100){

            soma += x;
            x++;
        }
        System.out.println("A soma total de x e: " + soma);
    }
}
