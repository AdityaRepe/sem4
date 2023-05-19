import java.util.*;
public class citizen {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your country ");
		String ctr=in.nextLine();
		System.out.println("Enter your age");
		int age=in.nextInt();
		String ind="india";
		if( ctr.equalsIgnoreCase(ind) && age>=18)
			System.out.println("You are eligible to vote ");
		else
			System.out.println("You are not eligible to vote");
	}
}
