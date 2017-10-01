package DZ3;

import java.util.Arrays;

public class ArraysMerge {
    public static void main(String[] args) {
        int[] arrayFirst = new int[]{1, 2, 3, 4, 5, 6};
        int[] arraySecond = new int[]{5, 6, 7};
        int[] arrayThird = mergeArrays(arrayFirst, arraySecond);

        System.out.println(Arrays.toString(arrayThird));
    }

    private static int[] mergeArrays(int[] arrayFirst, int[] arraySecond){

        int[] outArray = new int[arrayFirst.length + arraySecond.length];

        for (int i = 0, j = 0, k = 0; k < outArray.length; k++){
            if (i == arrayFirst.length) {
                outArray[k] = arraySecond[j++];
                continue;
            }
            if (j == arraySecond.length) {
                outArray[k] = arrayFirst[i++];
                continue;
            }
            outArray[k] = arrayFirst[i++];
            outArray[k + 1] = arraySecond[j++];
            ++k;
        }
    return outArray;
    }
}
