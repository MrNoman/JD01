package DZ3;

import java.util.Arrays;
import java.util.Random;

public class EraseRepeats {
    public static void main(String[] args) {
        int arrayLength = 10;
        int[] array = new int[arrayLength];
        System.out.println(Arrays.toString(eraseAllRepeats(formRandomArray(array))) + " массив после обработки");
    }

    private static int[] eraseAllRepeats(int[] array) {
        System.out.println(Arrays.toString(array) + " массив до обработки");
        System.out.println(Arrays.toString(eraseAllRepeatsCheat(array)) + " Чит-метод");
        int countDelete = 0;

        for (int i = 0; i < array.length - countDelete; i++) {
            for (int j = i + 1; j < array.length - countDelete; j++) {
                if (array[i] == array[j]) {
                    System.arraycopy(array, j + 1, array, j , array.length - 1 - j);
                    countDelete++;
                    j--;
                }
            }
        }

        int[] arrayToReturn = new int[array.length - countDelete];

        System.arraycopy(array, 0, arrayToReturn, 0, array.length - countDelete );
        return arrayToReturn;
    }

    private static int[] eraseAllRepeatsCheat(int[] array) {
        return Arrays.stream(array).distinct().toArray();
    }

    private static int[] formRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
}
