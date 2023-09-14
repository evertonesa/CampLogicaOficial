import java.util.Scanner;

public class EncerraPrograma {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int num;

        System.out.println("Digite um numero: ");
        num = entrada.nextInt();

        while (num != 10) {
            System.out.println("Digite outro numero:");
            num = entrada.nextInt();
        }
        System.out.println("Programa encerrado");
    }
}
