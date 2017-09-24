import java.util.Scanner;

public class AmmountOfDigits {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(adder(a));
    }

    public static int adder (int number) {
        if (number == 0) {
            return 0;
        }
        int result = adder(number / 10) + number % 10;
        return result;
    }
}
