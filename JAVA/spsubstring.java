import java.util.*;

public class spsubstring {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String originalString = in.nextLine();
        System.out.println("Enter the character or substring to search: ");
        String searchQuery = in.nextLine();
        boolean found = originalString.contains(searchQuery);
        if (found) {
            System.out.println("The search query was found in the string.");
        } else {
            System.out.println("The search query was not found in the string.");
        }
    }
}