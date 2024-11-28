 import java.util.Scanner;
public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        // Convert text to lowercase and remove non-alphanumeric characters
        String cleanedText = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Check if cleaned text reads the same forwards and backwards
        int length = cleanedText.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedText.charAt(i) != cleanedText.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word or phrase: ");
        String text = scanner.nextLine();

        if (isPalindrome(text)) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }
          scanner.close();
    }

}
