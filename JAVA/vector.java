import java.util.*;

public class vector {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of names");
        int n=in.nextInt();
        System.out.println("Enter names");
        Vector<String> name = new Vector<>();
        for (int i = 0; i <= n; i++) {
            String t = in.nextLine();
            name.add(t);
        }
        for (String i : name) {
            System.out.println(i);
        }
    }
}