public class ransomeNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        // Create an array to store the frequency of each letter in the magazine
        int[] magazineLetters = new int[26];

        // Count the frequency of each letter in the magazine
        for (char c : magazine.toCharArray()) {
            magazineLetters[c - 'a']++;
        }

        // Check if ransomNote can be constructed
        for (char c : ransomNote.toCharArray()) {
            // If there are not enough letters in the magazine, return false
            if (magazineLetters[c - 'a'] == 0) {
                return false;
            }
            // Decrease the count of the letter used
            magazineLetters[c - 'a']--;
        }

        // If all letters are found, return true
        return true;
    }
    public static void main(String[] args) {
        ransomeNote solution = new ransomeNote();

        // Test cases
        String ransomNote = "a";
        String magazine = "b";
        boolean result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can ransom note be constructed? " + result);

        ransomNote = "aa";
        magazine = "ab";
        result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can ransom note be constructed? " + result);

        ransomNote = "aa";
        magazine = "aab";
        result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can ransom note be constructed? " + result);

        ransomNote = "hello";
        magazine = "heollworld";
        result = solution.canConstruct(ransomNote, magazine);
        System.out.println("Can ransom note be constructed? " + result);
    }
}
