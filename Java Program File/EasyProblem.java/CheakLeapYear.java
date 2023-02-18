import java.util.Scanner;

public class CheakLeapYear {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Number");
        int year = scn.nextInt();
        System.out.print(is_LeapYear(year));
    }

    public static boolean is_LeapYear(int y) {
        boolean a = (y % 4) == 0;
        boolean b = (y % 100) != 0;
        boolean c = ((y % 100 == 0) && (y % 400 == 0));
        return a && (b || c);
    }
}
