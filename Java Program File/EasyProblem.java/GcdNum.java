public class GcdNum {
     
	static int GCD(int x, int y)
	{
		if (y == 0)
			return x;
		return GCD(y, x % y);
	}

	public static void main(String[] args)
	{
		int x = 47, y = 91;
		System.out.println("The GCD of " + x + " and " + y+ " is: " + GCD(x, y));
	}

}
