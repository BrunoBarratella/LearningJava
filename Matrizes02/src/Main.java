import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite quantas linhas sua matriz tera:");
        int lines = input.nextInt();
        System.out.println("Digite quantas colunas sua matriz tera:");
        int col = input.nextInt();

        input.nextLine(); //Limpa o "\n" deixado pelo nextInt();
        int[][] matriz = new int[lines][col];
        for (int i = 0; i < matriz.length; i++){
            for (int x = 0; x < matriz[i].length; x++){
                System.out.println("Digite aqui o valor de ["+i+"]["+x+"]");
                String values = input.nextLine();
                String[] parts = values.replace(" ", "").split(",");
                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);

                matriz[i][x] = a;
                if (x+1 < matriz[i].length){
                    matriz[i][x] = b;
                }
            }
        }

        
    }
}