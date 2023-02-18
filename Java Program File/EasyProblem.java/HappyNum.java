class Solution {
    public static boolean isHappy(int n) {
        if(n==1 || n==7) return true;
        if (n<=9) return false;
        
        int squareSum = 0;
        while (n!= 0)
        {
            squareSum += (n % 10) * (n % 10);
            n /= 10;
        }
         n = squareSum;
         return isHappy(n);
    }
    public static void main(String[] args) {
        int n=19;
        if(isHappy(n)){
            System.out.println("Happy NUmber");
        }
        else{
            System.out.println("Not happy Number");
        }
    }
}