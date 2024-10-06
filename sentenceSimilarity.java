public class sentenceSimilarity {
    public boolean areSentencesSimilar(String s1, String s2) {
        // Split the words in sentences and store it in a string array.
        String[] s1Words = s1.split(" "), s2Words = s2.split(" ");
        int start = 0, ends1 = s1Words.length - 1, ends2 =
                s2Words.length - 1, s1WordsLength = s1Words.length, s2WordsLength =
                s2Words.length;

        // If words in s1 are more than s2, swap them and return the answer.
        if (s1WordsLength > s2WordsLength) {
            return areSentencesSimilar(s2, s1);
        }

        // Find the maximum words matching from the beginning.
        while (start < s1WordsLength && s1Words[start].equals(s2Words[start])) {
            ++start;
        }
        // Find the maximum words matching in the end.
        while (ends1 >= 0 && s1Words[ends1].equals(s2Words[ends2])) {
            --ends1;
            --ends2;
        }

        // If i reaches the end of the array, then we return true.
        return ends1 < start;
    }
    public static void main(String[] args) {
        sentenceSimilarity solution = new sentenceSimilarity();

        // Test cases
        String s1 = "My name is Dikshya";
        String s2 = "My name is";

        boolean result = solution.areSentencesSimilar(s1, s2);
        System.out.println("Are the sentences similar? " + result);

        s1 = "Hello world";
        s2 = "world";
        result = solution.areSentencesSimilar(s1, s2);
        System.out.println("Are the sentences similar? " + result);

        s1 = "I love programming";
        s2 = "I love coding";
        result = solution.areSentencesSimilar(s1, s2);
        System.out.println("Are the sentences similar? " + result);

        s1 = "Coding is fun";
        s2 = "fun";
        result = solution.areSentencesSimilar(s1, s2);
        System.out.println("Are the sentences similar? " + result);
    }
}
