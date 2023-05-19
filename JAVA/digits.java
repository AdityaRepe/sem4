import java.util.*;
public class digits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = in.nextInt();
        if (number <= 0) {
            System.out.println("Invalid input! Please enter a positive integer.");
        }
        int cnt=0;
        int temp = number;
        while(temp!=0){
            temp/=10;
            cnt++;
        }
        System.out.println("The number of digits in " + number + " is: " + cnt);
    }
}