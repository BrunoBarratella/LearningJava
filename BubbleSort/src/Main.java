public class Main {
    public static void main(String[] args) {
        int [] listOfNumbers = {55, 10, 78, 35, 23, 45, 2, 73};
        boolean isOrdened;

        for (int x = 0; x < listOfNumbers.length - 1; x++){
            isOrdened = false;
            for (int y = 0; y < listOfNumbers.length - x -1; y++){
                if (listOfNumbers[y] > listOfNumbers[y+1]){
                    int tmp = listOfNumbers[y];
                    listOfNumbers[y] = listOfNumbers[y+1];
                    listOfNumbers[y+1] = tmp;
                    isOrdened = true;
                }
            }
            if (!isOrdened){
                break;
            }
        }
        System.out.println("Array ordenado:");
        for (int i = 0; i < listOfNumbers.length; i++) {
            System.out.print(listOfNumbers[i] + " ");
        }
    }
}