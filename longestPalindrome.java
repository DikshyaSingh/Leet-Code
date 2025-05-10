import java.util.HashSet;

public class longestPalindrome {
    public int longestpalindrome(String s) {
        // Set to store characters that appear an odd number of times
        HashSet<Character> oddCountSet = new HashSet<>();


        
        // Iterate over the characters in the string
        for (char c : s.toCharArray()) {
            // If the character is already in the set, remove it (pairing it)
            if (oddCountSet.contains(c)) {
                oddCountSet.remove(c);
            } else {
                // Otherwise, add the character to the set (indicating it appears odd times)
                oddCountSet.add(c);
            }
            
        }

        // If there are odd characters left, the length of the palindrome is the length of the string minus the number of odd-count characters, plus 1 for the center character
        // If no odd characters left, the length is the length of the string (all characters are paired)
        return s.length() - (oddCountSet.size() > 0 ? oddCountSet.size() - 1 : 0);
    }

    public static void main(String[] args) {
        longestPalindrome solution = new longestPalindrome();

        // Test case
        String testString = "abccccdd";
        int result = solution.longestpalindrome(testString);

        System.out.println("The longest palindrome length is: " + result);
    }
}
