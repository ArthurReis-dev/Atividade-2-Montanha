import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero;
       

        System.out.print("Digite um número para ver seu fatorial: ");
        numero = scanner.nextInt();

        if(numero < 0 ){
            System.out.print("Numeros negativos não tem fatorial!");
        } 
        
        else{

            int resultado = 1;

            for(int i = 1; i <= numero; i++){
            
                resultado *= i;   
            }

            System.out.println("O fatorial de " + numero + " é " + resultado);

        }

        
        
        scanner.close();
    }
}