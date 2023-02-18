public class ReverseNum {
	public static void main (String[] args) {
		String str= "Geeks", rev="";
    for (int i=0; i<str.length(); i++)
	{
       char ch = str.charAt(i);
           rev = ch + rev;
	}
    System.out.println("Reversed word: "+ rev);
	}
}
