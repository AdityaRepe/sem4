import java.util.*;
public class compare {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter first string ");
		String a=in.nextLine();
		System.out.println("Enter second string ");
		String b=in.nextLine();
		if(a.equals(b))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
	}
}
