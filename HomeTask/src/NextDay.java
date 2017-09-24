import java.util.Scanner;

public class NextDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи день");
        int day = scanner.nextInt();
        System.out.println("Введи месяц");
        int mounth = scanner.nextInt();
        System.out.println("Введи год");
        int year = scanner.nextInt();

        if (day > 31 || mounth > 12 || year < 0 || day ==0 || mounth ==0) {
            System.out.println("Дата некорректна");
            return;
        }
        if (isRealDate(day, mounth, year)) {
            nextDay(day,mounth,year);
        } else {
            System.out.println("Дата некорректна");
        }
        return;
    }

    public static void nextDay  (int day, int mounth, int year) {
        boolean correctDate = false;
        int theNextDay = 0;
        int theNextMonth = 0;
        int theNextYear = 0;

        if (mounth == 2){
            if (isLeapYear(year)) {
                if (day == 29){
                    theNextDay = 1;
                    theNextMonth = ++mounth;
                    theNextYear = year;
                } else if (day < 29){
                    theNextDay = ++day;
                    theNextMonth = mounth;
                    theNextYear = year;
                }
            } else if (day < 28) {
                theNextDay = ++day;
                theNextMonth = mounth;
                theNextYear = year;
            } else if (day == 28) {
                theNextDay = 1;
                theNextMonth = ++mounth;
                theNextYear = year;
            }
        } else if (is30(mounth) && day < 30) {
            theNextDay = ++day;
            theNextMonth = mounth;
            theNextYear = year;
        } else if (is30(mounth) && day == 30) {
            theNextDay = 1;
            theNextMonth = ++mounth;
            theNextYear = year;
        } else if (is31(mounth) && day < 31) {
            theNextDay = ++day;
            theNextMonth = mounth;
            theNextYear = year;
        } else if (is31(mounth) && day == 31) {
            if (mounth == 12 ) {
                theNextDay = 1;
                theNextMonth = 1;
                theNextYear = ++year;
            } else {
                theNextDay = 1;
                theNextMonth = ++mounth;
                theNextYear = year;
            }
        }


        System.out.println("Следующий день: "+formatDate(theNextDay,theNextMonth,theNextYear));
        return;
    }

    public static String formatDate (int day, int mounth, int year){
        return day + "." + mounth + "." + year;
    }


    public static boolean isRealDate(int day, int mounth, int year){
        boolean correctDate = false;
        if (mounth == 2){
            if (isLeapYear(year)) {
                if (day <= 29){
                    correctDate = true;
                } else if (day > 29){
                    correctDate = false;
                }
            } else if (day <= 28){
                correctDate = true;
            }
        } else if (is30(mounth) && day <= 30) {
            correctDate = true;
        } else if (is31(mounth) && day <= 31) {
            correctDate = true;
        } else {
            correctDate = false;
        }

        return correctDate;
    }


    public static boolean is30 (int mounth){
        switch (mounth){
            case 4:
            case 6:
            case 9:
            case 11:
                return true;
            default:
                return false;
        }
    }

    public static boolean is31 (int mounth){
        switch (mounth){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return true;
            default:
                return false;
        }
    }

    public static boolean isLeapYear (int year){
        return (((year % 4) == 0 && (year % 100) !=0) ||  (year % 400) ==0)?true:false;

    }

}

