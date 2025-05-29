import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = {45, 12, 89, 33, 76, 28, 55, 4, 90, 17, 61, 38};
        boolean troca;


        for (int i = 0; i< numeros.length-1;i++){
            troca = false;
            for (int x = 0; x < numeros.length-1-i;x++){
                if(numeros[x] > numeros[x+1]){
                    int tmp = numeros[x];
                    numeros[x] = numeros[x+1];
                    numeros[x+1] = tmp;
                    troca = true;
                }

            }
            System.out.println("Passagem " + (i + 1) + ": " + Arrays.toString(numeros));
            if (!troca){
                break;
            }

        }
        for (int y :numeros){
            System.out.print(y+" ");
        }
    }
}