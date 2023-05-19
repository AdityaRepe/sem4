import java.util.*;
public class vowels {

	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=in.nextLine();
		str=str.toLowerCase();
		int cnt=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u')
				cnt++;
		}
		System.out.println("No of vowels "+cnt);
	}
}
