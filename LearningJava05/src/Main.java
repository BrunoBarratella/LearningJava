import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        do {
            System.out.println("1 - Calcular área de um Quadrado");
            System.out.println("2 - Calcular área de um Retângulo");
            System.out.println("3 - Calcular área de um Circulo");
            System.out.println("4 - Sair");
            option = input.nextInt();

            switch (option){
                case 1:
                    System.out.println("Digite o valor do lado:");
                    double lado = input.nextDouble();
                    System.out.println("Área do quadrado: " + (lado * lado));
                    break;
                case 2:
                    System.out.println("Digite o valor da base do Retângulo:");
                    double base = input.nextDouble();
                    System.out.println("Digite o valor da altura do Retângulo:");
                    double altura = input.nextDouble();

                    System.out.println("\nA área deste Retângulo é:");
                    System.out.println(base*altura+"\n");
                    break;
                case 3:
                    double pi = 3.14;
                    System.out.println("Digite o valor do raio:");
                    double raio = input.nextDouble();
                    System.out.println("Área do círculo: " + (pi * raio * raio));
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Inválido");
            }
        }while  (option != 4);
        input.close();
    }
}