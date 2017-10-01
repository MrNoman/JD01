package DZ3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LinearizeMethod {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте мерность массива m*n: ");
        int dimensionN = in.nextInt();
        int dimensionM = in.nextInt();
        int[][] twoDimensionalRandomArray = formRandomArray(dimensionN, dimensionM);

        System.out.println("Двумерный массив: " + Arrays.deepToString(twoDimensionalRandomArray));
        System.out.println("Одномерный массив:" + Arrays.toString(linearize(twoDimensionalRandomArray)));
    }

    private static int[] linearize(int[][] inputArray){
        int[] outArray = new int[inputArray.length * inputArray[0].length];
        int outArrayIndex = 0;
        for (int[] anInputArray : inputArray) {
            for (int j = 0; j < inputArray[0].length; j++) {
                outArray[outArrayIndex] = anInputArray[j];
                outArrayIndex++;
            }
        }
        return outArray;
    }

    private static int[][] formRandomArray(int dimensionX, int dimensionY) {
        Random random = new Random();
        int[][] outputArray = new int[dimensionX][dimensionY];
        for (int i = 0; i < dimensionX; i++) {
            for (int j = 0; j < dimensionY; j++) {
                outputArray[i][j] = random.nextInt(10);
            }
       }
        return outputArray;
    }
}
