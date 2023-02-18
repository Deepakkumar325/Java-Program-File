import java.util.*;
class SwapNum {
	static void Swap(int m, int n)
	{
		int temp = m;
		m = n;
		n = temp;
		System.out.println("Value of m is " + m+ " and Value of n is " + n);
	}

	public static void main(String[] args)
	{
		int m = 9, n = 5;

		Swap(m, n);
	}
}
