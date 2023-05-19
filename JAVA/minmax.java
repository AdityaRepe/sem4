import java.util.*;
public class minmax {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter number of elements in an array");
		int n=in.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in an array ");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		int min=a[0],max=a[0];
		for(int i=0;i<n;i++)
		{
			if(a[i]>max)
				max=a[i];
			if(a[i]<min)
				min=a[i];
		}
		System.out.println("Maximum element "+max+" Minimum element "+min);
	}
}
