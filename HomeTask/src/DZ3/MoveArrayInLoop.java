package DZ3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.io.IOException;

public class MoveArrayInLoop {
    public static void main(String[] args) throws InterruptedException, IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Задайте длину массива:");
        int arrayLength = in.nextInt();
        int[] array = new int[arrayLength];
        loopArray(formRandomArray(array));
    }

    public static void loopArray(int[] array) throws InterruptedException, IOException {
        System.out.println("Для окончания выполнения нажмите Enter...");
        Scanner in = new Scanner(System.in);
        System.out.println(Arrays.toString(array));
        do {
            int exchangeNumber = array[array.length - 1];
            for (int i = array.length - 1; i >= 0; i--) {
                if (i == 0) {
                    array[i] = exchangeNumber;
                } else {
                    array[i] = array[i - 1];
                }
            }
            System.out.println(Arrays.toString(array));
            Thread.sleep(1000);
        } while (System.in.available() == 0);
    }

    public static int[] formRandomArray(int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }
}
