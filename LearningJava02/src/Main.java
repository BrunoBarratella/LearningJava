import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("========== Digite aqui um numero A ==========");
        int numberA = input.nextInt();
        System.out.println("========== Digite aqui um numero B ==========");
        int numberB = input.nextInt();

        System.out.println("\nAqui esta as possiveis operações aritmética entre esses numeros:");
        System.out.println("Adição: " + (numberA + numberB));
        System.out.println("Subtração: " + (numberA - numberB));
        System.out.println("Multiplicação: " + numberA * numberB);
        if (numberB != 0) {
            System.out.println("Divisão: " + ((double)numberA / numberB));
            System.out.println("Resto da divisão: " + numberA % numberB);
        }else {
            System.out.println("Não é possivel dividir por 0");
        }

        if (numberA > numberB){
            System.out.println("O primeiro numero é maior que o segundo");
        }else if (numberA < numberB){
            System.out.println("O primeiro numero é menor que o segundo");
        }else {
            System.out.println("Os numero são iguais...");
        }
        input.close();
    }
}