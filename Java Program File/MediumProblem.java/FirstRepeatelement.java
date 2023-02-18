import java.util.HashSet;
class FirstREpeatelement {
	public static void main(String[] args) {
		int[] arr = {1, 5, 3, 4, 3, 5, 6};
	
	
		HashSet<Integer> set = new HashSet<>();
		int firstRepeat = -1;

		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i])) {
				firstRepeat = arr[i];
			} else {
				set.add(arr[i]);
			}
		}
         System.out.println(firstRepeat);
		
	}

	 
}