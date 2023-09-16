/**
 * Desafio do Camp db - Soma de Valores
 * @autor Everton Santos
 * @versão 1.0
 * @Data 16-09-2023
 */


import java.util.Scanner;

public class BloqueioDeUsuario {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String usuario, senha, resp;



        do{
            System.out.println("Informe o nome de usuario:");
            usuario = entrada.next();
            System.out.println("Informe a senha:");
            senha = entrada.next();

            if (usuario.equals("aluno") && senha.equals("segredo")){
                System.out.println("Bem Vindo!");
                break;
            } else {
                System.out.println("Login nao efetuado, caso erre tres vezes, seu usuario sera bloqueado!");
            }
            System.out.println("Deseja realizar mais uma tentativa de login? [S/N]");
            resp = entrada.next();
        }while (resp.equals("S"));
    }
}
