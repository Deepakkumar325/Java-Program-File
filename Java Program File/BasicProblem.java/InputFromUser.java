// import java.io.*;
import java.util.Scanner;
 
class InputFromUser {
    public static void main(String[] args)
    {
        int n;
        System.out.println("Enter the integer: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Entered integer is: "+ n);
    }
}