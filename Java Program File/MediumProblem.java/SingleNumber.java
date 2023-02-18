public class SingleNumber {
    public static void main(String[] args) {
        
    int arr[] = {8, 8, 7, 7, 6, 6, 1};
// Output: 1
            int sum =0;
            for(int i=0;i<arr.length;i++){
                 sum ^=arr[i];
            }
          System.out.println(sum);
        }
    }
