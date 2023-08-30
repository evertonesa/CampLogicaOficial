import java.util.Scanner;

public class MercadoCompra {

    public static void main(String[] args) {
        System.out.println("Bebidas disponiveis na conveniencia Nosso Emporio:");
        System.out.println("* Cerveja");
        System.out.println("* Refrigerante");
        System.out.println("* Agua");

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual bebida deseja comprar? ");
        String bebida = entrada.nextLine();

        int idade;
        if (bebida.contains("Cerveja") || bebida.contains("cerveja")) {
            System.out.println("Qual sua idade? ");
            idade = entrada.nextInt();
            if (idade < 18) {
                System.out.println("Compra negada, voce e menor de idade");
            } else {
                System.out.println("Compra efetuada com sucesso");
            }
        } else if (bebida.contains("Refrigerante") || bebida.contains("refrigerante") ||
                bebida.contains("Agua") || bebida.contains("agua"))  {
            System.out.println("Compra efetuada com sucesso");
        }
    }
}
