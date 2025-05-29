import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Digite 5 numeros");
        for (int i = 0; i < numbers.length; i++){
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        System.out.println("\nNumeros digitados foram:");
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }
        input.close();
    }
}