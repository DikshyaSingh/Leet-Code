import java.util.HashSet;
import java.util.Set;


public class LongestSubstringWithoutRepeatingCharacters {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Set<Character> charSet = new HashSet<>();
        int left = 0;

        for (int right = 0; right <n; right++) {
            if (!charSet.contains(s.charAt(right))) {
                charSet.add(s.charAt(right));
                maxLength = Math.max(maxLength, right - left + 1);
            } else {
                while (charSet.contains(s.charAt(right))) {
                    charSet.remove(s.charAt(left));
                    left++;
                }
                charSet.add(s.charAt(right));
            }
        }

        return maxLength;
    }
    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters solution = new LongestSubstringWithoutRepeatingCharacters();

        // Test cases
        String test1 = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters in \"" + test1 + "\": "
                + solution.lengthOfLongestSubstring(test1)); // Output: 3

        String test2 = "bbbbb";
        System.out.println("Length of longest substring without repeating characters in \"" + test2 + "\": "
                + solution.lengthOfLongestSubstring(test2)); // Output: 1

        String test3 = "pwwkew";
        System.out.println("Length of longest substring without repeating characters in \"" + test3 + "\": "
                + solution.lengthOfLongestSubstring(test3)); // Output: 3

        String test4 = "";
        System.out.println("Length of longest substring without repeating characters in \"" + test4 + "\": "
                + solution.lengthOfLongestSubstring(test4)); // Output: 0
    }
}
