import java.util.*;

public class cheakNumPostive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        System.out.print("Enter the Number : ");
        x = sc.nextInt();
        if (x >= 0) {
            System.out.print("You entered a positive number");
        } else {
            System.out.print("You number is negative and is skipped");
        }
    }
}