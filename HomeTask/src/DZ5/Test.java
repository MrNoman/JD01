package DZ5;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите X и Y первой точки: ");
        Point firstPoint = new Point(in.nextFloat(), in.nextFloat());
        System.out.println("Введите X и Y второй точки: ");
        Point secondPoint = new Point(in.nextFloat(), in.nextFloat());
        System.out.println("Расстояние между точками: " + firstPoint.distance(secondPoint));
        System.out.println("Автоматически скармливаем точки в Rectangle");
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);
        System.out.println("Площадь: " + rectangle.calculateArea());
        System.out.println("Длина диагонали: " + rectangle.diagonalLength());
    }
}
