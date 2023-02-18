public class moveNegnum{
	public static void main(String[] args)
	{
		int[] arr = {8,4,-4,-9,5,-8,-7,8,-2,1};
        int temp;
        int i;
        int j;

        for (i = 0; i < arr.length; i++) 
        {
            for (j = i + 1; j < arr.length; j++) 
            {
                if (arr[i] > 0 && arr[j] < 0) 
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Array after moving all negative elements to one side: ");
        for (int k = 0; k < arr.length; k++) 
        {
            System.out.print(arr[k] + " ");
        }
    }
	
	
}