import java.util.*;
public class factorial {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		int fac=1;
		for(int i=n;i>=1;i--)
		{
			fac=fac*i;
		}
		System.out.println("Factorial : "+fac);
	}
}
