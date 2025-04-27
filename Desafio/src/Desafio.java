import java.util.Scanner;

public class Desafio{
    
    //função para dividir o juros por 100
     static double div(double r){
        return r / 100;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double p; //valor do investimento inicial
        double t; //valor de investimento em anos
        double montante;
        String novo; //para perguntar se o usuário quer fazer uma nova conta
        String cap; //capitalização
        

        do{

        System.out.print("Digite o valor de investimento inicial: ");
        p = scanner.nextDouble();

        System.out.print("Digite a taxa de juros anual (%): ");
        double r = scanner.nextDouble();

        System.out.print("Digite o período de investimento (em anos): ");
        t = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Qual a opção de capitalização?");
        System.out.print("s- Simpes / c- Composta: ");
        cap = scanner.nextLine();

        //conta montante simpes
        if(cap.equalsIgnoreCase("s")){
            montante = p * (1 + div(r) * t);
            System.out.println("O valor do montante foi de: R$" + montante);
        }

        //conta montate composto
        else if(cap.equalsIgnoreCase("c")){
            montante = p * Math.pow(1 + div(r), t);
            System.out.println("O valor do montante foi de: R$" + montante);
        }

        else{
            System.out.println("Opção inválida! Use 's' para simpes ou 'c' para composto");
        }
        
        System.out.println("Gostaria de fazer outra conta? (s-Sim / n- Não)");
        novo = scanner.nextLine();

        if(novo.equalsIgnoreCase("n")){
            System.out.println("Programa finalizado!");
        }
        
        
        }while(!novo.equals("n"));

        

        scanner.close();
    }
}