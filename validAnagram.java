import java.util.Arrays;
import java.util.Scanner;

public class validAnagram {
    public static void main(String[] args) {
         String s = "anagram";
        String  t = "naagram";
        System.out.println(isAnagram(s,t));
    }
    public static boolean isAnagram(String s, String t) {

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}
