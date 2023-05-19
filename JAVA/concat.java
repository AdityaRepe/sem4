import java.util.*;
public class concat {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String a=in.nextLine();
		System.out.println("Enter a string");
		String b=in.nextLine();
		String c=a+b;
		int l1=a.length();
		int l2=b.length();
		int l3=c.length();
		System.out.println(l1+" "+l2+" "+l3+" "+c);
	}
}
