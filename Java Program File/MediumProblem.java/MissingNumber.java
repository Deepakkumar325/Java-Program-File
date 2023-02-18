class MissingNumber {
    public static void main(String[] args) {
    int arr[] = {1,2,3,5};
         int arraysum = 0,n= arr.length;
         for(int i = 0; i < arr.length - 1; i++)
         {
             arraysum = arraysum + arr[i];//11
         }
         int totalsum = (n * (n + 1)) / 2;   //5*6=30/2=15-11=4
         System.out.println(totalsum - arraysum);
     }
 }