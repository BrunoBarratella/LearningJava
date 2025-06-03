import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o numero de colunas:");
        int col = input.nextInt();
        System.out.println("Informe o numero de linhas:");
        int linha = input.nextInt();

        input.nextLine();

        int[][] matriz = new int[col][linha];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.println("Digite o valor para["+ i +"]" +
                        "["+ j +"]:");
                String matrizValue = input.nextLine();
                String[] parts = matrizValue.replace(" ", "").split(",");

                int a = Integer.parseInt(parts[0]);
                int b = Integer.parseInt(parts[1]);

                matriz[i][j] = a;

                if (j + 1 < matriz[i].length) {
                    matriz[i][j + 1] = b;
                }

                if (matriz[j]==matriz[i]){

                }
            }
        }

        // Exibindo a matriz
        System.out.println("\nMatriz preenchida:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Somando todos os elementos da matriz
        int somaTotal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaTotal += matriz[i][j];
            }
        }
        System.out.println("\nA soma de todos os elementos da matriz é: " + somaTotal);

        // Somando a diagonal principal (se for matriz quadrada)
        if (matriz.length == matriz[0].length) {
            int somaDiagonal = 0;
            for (int i = 0; i < matriz.length; i++) {
                somaDiagonal += matriz[i][i];
            }
            System.out.println("A soma da diagonal principal é: " + somaDiagonal);
        } else {
            System.out.println("A matriz não é quadrada, sem soma de diagonal principal.");
        }

        input.close();

    }
}