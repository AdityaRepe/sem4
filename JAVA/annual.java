import java.util.*;
public class annual {
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int rno[]=new int[5];
	int a[]=new int[5];
	int b[]=new int[5];
	int c[]=new int[5];
	int total[]=new int[5];
	for(int i=0;i<5;i++)
	{
		System.out.println("Enter your roll number");
		rno[i]=in.nextInt();
		System.out.println("Enter marks for 1st subject");
		a[i]=in.nextInt();
		System.out.println("Enter marks for 2nd subject");
		b[i]=in.nextInt();
		System.out.println("Enter marks for 3rd subject");
		c[i]=in.nextInt();
	}
	for(int i=0;i<5;i++)
	{
	    total[i]=a[i]+b[i]+c[i];
		System.out.println("Total Marks of "+rno[i]+" student is "+total[i]);
	}
	int max=total[0];
	for(int i=0;i<5;i++)
	{
		if(total[i]>max)
			max=total[i];
	}
	System.out.println("Highest marks "+max);
}
}
