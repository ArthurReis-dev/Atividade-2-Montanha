import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double numero = 0.0;
        double resultado = 0.0;

        while (numero >= 0) {
            System.out.print("Digite um número positivo para ser somado (Digite um numero negativo para sair): ");
            numero = scanner.nextDouble();

            if (numero < 0) {
                break;
            }

            resultado = resultado + numero;
        }

        System.out.println("A soma total dos numeros foi: " + resultado);

        scanner.close();
    }
}