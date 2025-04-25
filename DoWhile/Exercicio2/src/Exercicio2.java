import java.util.Scanner;

public class Exercicio2{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int opcoes = 0;

        do{
            System.out.println("1.Adicionar \n2.Remover\n3.Sair");
            opcoes = scanner.nextInt();
            
            if(opcoes == 1){
                System.out.println("Adicionado com sucesso!");
            }

            else if(opcoes == 2){
                System.out.println("Removido com sucesso!");
            }


        }while(opcoes != 3);

        System.out.println("Programa finalizado!");
        
        scanner.close();

    }
}