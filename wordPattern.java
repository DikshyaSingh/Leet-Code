import java.util.HashMap;

public class wordPattern {
    public boolean wordpattern(String pattern, String s) {
        String arr[] = s.split(" ");
        if(pattern.length() != arr.length)
            return false;

        HashMap<Character,String> h = new HashMap<>();
        for(int i = 0; i < arr.length;i++)
        {
            if(!h.containsKey(pattern.charAt(i)))
            {
                if(!h.containsValue(arr[i]))
                {
                    h.put(pattern.charAt(i),arr[i]);
                }
                else return false;
            }
            else
            {
                if(arr[i].compareTo(h.get(pattern.charAt(i))) != 0) return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        wordPattern solution = new wordPattern();

        // Test case 1
        String pattern1 = "abba";
        String s1 = "dog cat cat dog";
        boolean result1 = solution.wordpattern(pattern1, s1);
        System.out.println("Does pattern match with the string? " + result1);

        // Test case 2
        String pattern2 = "abba";
        String s2 = "dog cat cat fish";
        boolean result2 = solution.wordpattern(pattern2, s2);
        System.out.println("Does pattern match with the string? " + result2);

        // Test case 3
        String pattern3 = "aaaa";
        String s3 = "dog dog dog dog";
        boolean result3 = solution.wordpattern(pattern3, s3);
        System.out.println("Does pattern match with the string? " + result3);

        // Test case 4
        String pattern4 = "abba";
        String s4 = "dog dog dog dog";
        boolean result4 = solution.wordpattern(pattern4, s4);
        System.out.println("Does pattern match with the string? " + result4);
    }
}
