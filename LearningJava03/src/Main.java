import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("\nDigite a operação que deseja: Adição(1), Subtração(2), Multiplicação(3), Divisão(4)");
        int choice = input.nextInt();
        System.out.println("Digite o primeiro valor da operação:");
        int numberA = input.nextInt();
        System.out.println("Agora o segundo:");
        int numberB = input.nextInt();

        switch (choice){
            case 1:
                System.out.println(numberA+numberB);
                break;
            case 2:
                System.out.println(numberA-numberB);
                break;
            case 3:
                System.out.println(numberA*numberB);
                break;
            case 4:
                if (numberB != 0){
                    System.out.println(numberA/numberB);
                }else {
                    System.out.println("Não é possivel dividir por 0");
                }
                break;
            default:
                System.out.println("Operação inválida");

        }
    }
}