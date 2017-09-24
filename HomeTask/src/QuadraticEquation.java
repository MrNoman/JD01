import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        System.out.println("Введите a.b.c для уравнения вида ax^2+bx+c=0");
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();
        double c = in.nextDouble();

        if (isPositive(discriminant(a,b,c))) {
            double x1, x2;
            x1 = (-b - Math.sqrt(discriminant(a,b,c))) / (2 * a);
            x2 = (-b + Math.sqrt(discriminant(a,b,c))) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        }
        else if (isZero(discriminant(a,b,c))) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        }
        else {
            System.out.println("Уравнение не имеет действительных корней!");
        }
    }

    public static boolean isPositive (double number){
        return (number > 0)? true: false;
    }

    public static boolean isZero (double number){
        return (number == 0)? true: false;
    }

    public static double discriminant (double a, double b, double c) {
        return b * b - 4 * a * c;
    }
}

