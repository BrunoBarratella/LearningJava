import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite aqui seu nome:");
        String name = input.nextLine();

        System.out.println("Digite Sua idade:");
        int age = input.nextInt();

        System.out.println("Digite Sua Altura:");
        double high = input.nextDouble();

        System.out.println("Você está estudando? (Sim ou Não):");
        String studyingAnswer = input.next();
        boolean studying = studyingAnswer.equalsIgnoreCase("sim");
        
        System.out.println("Digite a primeira letra de seu nome:");
        char firstCharOfName = input.next().charAt(0);


        System.out.println(name);
        System.out.println(age);
        System.out.println(high);
        System.out.println(studying);
        System.out.println(firstCharOfName);

        input.close();
    }
}