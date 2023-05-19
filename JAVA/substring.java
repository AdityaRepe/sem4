import java.util.*;
public class substring {
	
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter string ");
		String str=in.nextLine();
		System.out.println("Enter two indices ");
		int x=in.nextInt();
		int y=in.nextInt();
		String str1=str.substring(x,y);
		System.out.println("Substring : "+str1);
	}
}
