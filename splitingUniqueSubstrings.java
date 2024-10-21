import java.util.HashSet;
import java.util.Set;

public class splitingUniqueSubstrings {
    public int maxUniqueSplit(String s){
        Set<String> seen = new HashSet<>();
        return backtrack(s, 0 ,seen);

    }

    private int backtrack(String s, int i, Set<String> seen) {
        int start = 0;
        if (start == s.length())
            return 0;
        int maxCount = 0;
        for ( int end = start +1; end <= s.length(); ++end){
            String substring = s.substring(start, end);
            if(!seen.contains(substring)){
                seen.add(substring);
                maxCount = Math.max(maxCount, 1 + backtrack(s, end, seen));
                seen.remove(substring);
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        splitingUniqueSubstrings solution = new splitingUniqueSubstrings();

        // Test case 1: Example string "ababccc"
        String s1 = "ababccc";
        System.out.println("Max unique splits for \"" + s1 + "\": " + solution.maxUniqueSplit(s1));

        // Test case 2: Example string "abc"
        String s2 = "abc";
        System.out.println("Max unique splits for \"" + s2 + "\": " + solution.maxUniqueSplit(s2));

        // Test case 3: Example string "aaaa"
        String s3 = "aaaa";
        System.out.println("Max unique splits for \"" + s3 + "\": " + solution.maxUniqueSplit(s3));

    }
}
