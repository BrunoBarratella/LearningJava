import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n1 - Dizer Olá");
            System.out.println("2 - Dizer Tchau!");
            System.out.println("3 - Sair");

            option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Olá!");
                    break;
                case 2:
                    System.out.println("Tchau!");
                    break;
                case 3:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Inválido!");
            }
        } while(option != 3);
        input.close();
    }
}