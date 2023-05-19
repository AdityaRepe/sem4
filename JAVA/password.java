import java.util.*;

public class password {
    public static String setOfChars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%&*";
    static int len = setOfChars.length();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter password length: ");
        int passLen = sc.nextInt();
        String result = generate(passLen);
        System.out.println(result);
    }

    public static String generate(int n) {
        String password = "";
        for (int i = 0; i < n; i++) {
            int num = (int) (Math.random() * len);
            password += setOfChars.charAt(num);
        }
        return password;
    }
}