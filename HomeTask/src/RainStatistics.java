import java.util.Scanner;

public class RainStatistics {
    public static void main(String[] args) {

        System.out.println("Введите количество дней: ");
        Scanner in = new Scanner(System.in);
        int daysCounter = in.nextInt();

        rainfall(daysCounter);
    }

    public static void rainfall (int n) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество осадков.");
        int maxFlood = 0;
        int summFlood = 0;
        int daylyFlood = 0;

        for (int i = 1; i <= n; i++){
            System.out.print(" День " + i + ": \t");
            daylyFlood = in.nextInt();
            summFlood += daylyFlood;
            if (daylyFlood > maxFlood) {
                maxFlood = daylyFlood;
            }
        }

        System.out.println(" Количество дней: " + n);
        System.out.println(" Сумма осадков: " + summFlood);
        System.out.println(" Среднее количество осадков: " + (float) summFlood / n);
        System.out.println(" Максимальные дневные осадки: " + maxFlood);
    }
}
