
import java.util.*;
public class Fibonacci {
	public static int n1=0,n2=1;
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int n;
		System.out.println("Enter your number ");
		n=in.nextInt();
		System.out.println("Fibonacci Series");
		System.out.print(n1+" "+n2+" ");
		fibonacci(n-2);
	}
	public static void fibonacci(int n)
	{
		for(int i=0;i<n;i++)
		{
			int a=n1+n2;
			n1=n2;
			n2=a;
			System.out.print(a+" ");
		}
	}
}
