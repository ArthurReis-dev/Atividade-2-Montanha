import java.util.Scanner;

public class Exercicio3{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int vetor[] = new int[10];
        int resultado = 0;

        for(int i = 0; i < 10; i++){
            System.out.print("Digite um numero para ser somado: ");
            vetor[i] = scanner.nextInt();
            
            resultado += vetor[i];
        }

        System.out.println("O resultado da soma dos 10 números é: " +  resultado);

        scanner.close();
    }
}