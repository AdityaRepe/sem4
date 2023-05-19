import java.util.*;
public class spchar {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.nextLine();
		System.out.println("Enter character to be replaced");
		char a=in.next().charAt(0);
		System.out.println("Enter replacement character");
		char b=in.next().charAt(0);
		String str1=str.replace(a,b);
		System.out.println("Original "+str);
		System.out.println("Replaced "+str1);
	}
}
