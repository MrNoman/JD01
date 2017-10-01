package DZ4;

import java.util.Scanner;

public class RomanTaArab {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите римское число: ");
        StringBuilder rom = new StringBuilder(in.next());
        int x = romanToArab(rom);
        System.out.println("Арабский вариант: " + x);
    }

    private static int romanToArab(StringBuilder inputString) {
        String[] romanAnnotation = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] araicAnnotation = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        int outputArabicNumber = 0;
        int indexAnnotation = 0;
        while (inputString.length() > 0) {
            do {
                if (romanAnnotation[indexAnnotation].length() <= inputString.length()) {
                    if (romanAnnotation[indexAnnotation].equals(inputString.substring(0, romanAnnotation[indexAnnotation].length()))) {
                        outputArabicNumber += araicAnnotation[indexAnnotation];
                        inputString.delete(0, romanAnnotation[indexAnnotation].length());
                        if (inputString.length() == 0) {
                            return outputArabicNumber;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            } while (inputString.length() > 0);
            indexAnnotation++;
        }
        return 0;
    }
}
