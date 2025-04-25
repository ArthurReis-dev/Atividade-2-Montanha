import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha = 1235; //senha definida
        int senhaD = 0; //senha digitada

        System.out.print("Digite sua senha: ");
         senhaD = scanner.nextInt();

        while (senhaD != senha) {
            
            System.out.print("Senha incorreta, tente novamente: ");
            senhaD = scanner.nextInt();

        }

        System.out.println("Acesso concedido!");

        scanner.close();
    }
}
