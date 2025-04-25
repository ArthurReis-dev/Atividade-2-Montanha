import java.util.Scanner;
import java.util.Random;

public class Exercicio3{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroPC = random.nextInt(20) + 1; 
        int numeroD; // numero digitado pelo usuario
        int contador = 0;

        System.out.println("Um número entre 1 e 20 foi gerado!");

        do{
            System.out.print("Qual número foi: ");
            numeroD = scanner.nextInt();
            contador++;

            if(numeroD > numeroPC){
                System.out.println("O número digitado foi maior que o número gerado!");
            }

            if(numeroD < numeroPC){
                System.out.println("O número digitado foi menor que o número gerado!");
            }

        }while(numeroD != numeroPC);

        System.out.print("Parabéns você acertou qual era o número! Você teve o total de " + contador + " tentativas!");
        scanner.close();
    }
}