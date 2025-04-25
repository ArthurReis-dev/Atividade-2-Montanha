import java.util.Scanner;

public class Exercicio4{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        double notas;
        double conta = 0;
        double contador = 0;
        double media;
        String continuar;

        do{ 

            System.out.print("Digite a nota: ");
            notas = scanner.nextDouble();
            scanner.nextLine();

            if(notas < 0 || notas > 10){
                System.out.println("As notas só podem estar entre 0 e 10!");
                break;
            }
            
            System.out.println("Deseja inserir outra nota? (s/n)");
            continuar = scanner.nextLine();

           
            conta += notas;
            contador++;
            
        }while(!continuar.equals("n"));

        media = conta / contador;

        System.out.println("A media das notas é: " + media);

        scanner.close();
    }
}