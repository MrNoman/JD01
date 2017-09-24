import java.util.Scanner;

public class FibonacciNumbers {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();

        System.out.println("Последовательность Фибоначчи через рекурсию, для членов меньше " + n);

        int i = 1;
        while (fibonacciRecursion(i) <= n) {
            System.out.print(" " + fibonacciRecursion(i));
            i++;
        }

        System.out.println(" \n Последовательность Фибоначчи через цикл, для членов меньше " + n);
        fibonacciLoop(n);
    }

    public static void  fibonacciLoop(long n) {

        int n1=0;
        int n2=1;
        int n3=1;

        System.out.print(" 1");

        while (n3 < n) {
            System.out.print(" "+n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
        }
    }

    public static long fibonacciRecursion(long i) {
        if (i == 1 || i == 2) {
            return 1;
        }
        return fibonacciRecursion(i - 1) + fibonacciRecursion(i - 2);
    }
}
