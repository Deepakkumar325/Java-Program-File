import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scn.nextInt();
        int binarynum = 0;
        int power = 1;
        while(n != 0){
        int rem = n % 2;
        binarynum += rem * power;
        power *= 10;
        n /= 2;
        }
        System.out.print(binarynum);
        }
}