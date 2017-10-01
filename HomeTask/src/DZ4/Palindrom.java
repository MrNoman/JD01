package DZ4;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку");
        String inString = in.next();

        System.out.println("Проверка без учета пробелов и знаков препинания:");
        System.out.println(isPalindrom(inString) ? "Палиндром" : "Не палиндром");

        System.out.println("Проверка с учетом знаков препинания и пробелов:");
        System.out.println(isPalindromeStrait(inString) ? "Палиндром" : "Не палиндром");
    }

    private static boolean isPalindrom(String str){
        return str.replace(" ", "")
                .replace(",","")
                .replace(".","")
                .replace("!","")
                .replace("?","")
                .replace(";","")
                .replace(":","")
                .replace("-","")
                .equalsIgnoreCase(new StringBuilder(str.replace(" ","")
                        .replace(",","")
                        .replace(".","")
                        .replace("!","")
                        .replace("?","")
                        .replace(";","")
                        .replace(":","")
                        .replace("-",""))
                        .reverse().toString());
    }

    private static boolean isPalindromeStrait(String str){
        return str.equalsIgnoreCase( new StringBuilder(str).reverse().toString());
    }
}
