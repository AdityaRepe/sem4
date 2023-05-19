import java.util.*;
public class array {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of elements ");
		int n=in.nextInt();
		int a[]=new int[n];
		int ans[]=new int[n];
		int sum=0;
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			sum+=a[i];
		}
		for(int i=0;i<n;i++)
		{
			ans[i]=sum-a[i];
		}
		System.out.println("New Array ");
		for(int i=0;i<n;i++)
		{
			System.out.println(ans[i]);
		}
		
	}
}
