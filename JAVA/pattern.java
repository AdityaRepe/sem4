import java.util.*;
public class pattern {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number ");
		int n=in.nextInt();
		System.out.println("Pattern  1");
		boolean LtR=true;
		boolean RtL=false;
		int max=1;
		for(int i=1;i<=n;i++)
		{
			if(LtR)
			{
				for(int j=1;j<=max;j++)
					System.out.print(j+" ");
				max++;
				System.out.println();
				LtR=false;
				RtL=true;
			}
			else
			{
				for(int j=max;j>=1;j--)
					System.out.print(j+" ");
				max++;
				System.out.println();
				LtR=true;
				RtL=false;
			}
		}
		System.out.println("Pattern 2");
		char cur='A';
		char maxi=cur;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
			}
			char temp=maxi;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)temp);
				temp--;
			}
			maxi+=i+1;
			System.out.println();
		}
	}
}
