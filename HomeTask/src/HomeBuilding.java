import java.util.Scanner;

public class HomeBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи 'a'");
        int a = scanner.nextInt();
        System.out.println("Введи 'b'");
        int b = scanner.nextInt();
        System.out.println("Введи 'c'");
        int c = scanner.nextInt();
        System.out.println("Введи 'd'");
        int d = scanner.nextInt();
        System.out.println("Введи 'e'");
        int e = scanner.nextInt();
        System.out.println("Введи 'f'");
        int f = scanner.nextInt();

        System.out.println(isAvailable(a,b,c,d,e,f)?"Можно построить":"Построить нельзя");
    }

    private static boolean isAvailable (int a, int b, int c, int d, int e, int f) {
        boolean result = false;
        if ((e >= (a + c)) && (f >= b && f >= d)) {
            result = true;;
        } else if ((e >= (a + d)) && (f >= b && f >= c)) {
            result = true;;
        } else if ((e >= (b + c)) && (f >= a && f >= d)) {
            result = true;;
        } else if ((e >= (b + d)) && (f >= a && f >= c)) {
            result = true;;
        } else if ((f >= (a + c)) && (e >= b && e >= d)) {
            result = true;;
        } else if ((f >= (a + d)) && (e >= b && e >= c)) {
            result = true;;
        } else if ((f >= (b + c)) && (e >= a && e >= d)) {
            result = true;;
        } else if ((f >= (b + d)) && (e >= a && e >= c)) {
            result = true;;
        }
        else
            result = false;

        return result;
    }

}


