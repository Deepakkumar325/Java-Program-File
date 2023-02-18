public class AmstrongNum {

        public static void main(String[] args) {
    
            int number = 371, n, rem, ans = 0;
    
               n = number;
    
            while ( n!= 0)
            {
                rem = n % 10;
                ans += Math.pow(rem, 3);
                n /= 10;
            }
    
            if(ans == number)
                System.out.println(number + " is an Armstrong number.");
            else
                System.out.println(number + " is not an Armstrong number.");
        }
}
