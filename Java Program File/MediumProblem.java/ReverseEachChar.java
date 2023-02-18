import java.util.*;
class ReverseEachChar
{
	public static void main(String[] args) {
		String s = "I am the Best";
		String str[] = s.split(" ");
		String ans = "";
		for(int i=str.length-1;i>=0;i--){
			ans+=str[i] + "";
		}
		System.out.println(ans+"");
	}
}