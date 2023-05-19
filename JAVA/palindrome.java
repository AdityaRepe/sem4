import java.util.*;
public class palindrome {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.nextLine();
		boolean a=true;
		int n=str.length();
		for(int i=0;i<str.length()/2;i++)
		{
			if(str.charAt(i) != str.charAt(n-i-1))
				a=false;
		}
		if(a)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
	}
}
