public class MinimumAddtoMakeParenthesesValid {
    public int minAddToMakeValid(String s) {
        int openBrackets = 0;
        int minAddsRequired = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                openBrackets++;
            } else {
                // If an open bracket exists, match it with the closing one
                // If not, we need to add an open bracket.
                if (openBrackets > 0) {
                    openBrackets--;
                } else {
                    minAddsRequired++;
                }
            }
        }

        // Add the remaining open brackets as closing brackets would be required.
        return minAddsRequired + openBrackets;
    }
    public static void main(String[] args) {
        MinimumAddtoMakeParenthesesValid solution = new MinimumAddtoMakeParenthesesValid();

        // Test case 1
        String input1 = "())";
        System.out.println("Min additions required for " + input1 + ": " + solution.minAddToMakeValid(input1));

        // Test case 2
        String input2 = "(((";
        System.out.println("Min additions required for " + input2 + ": " + solution.minAddToMakeValid(input2));

        // Test case 3
        String input3 = "()";
        System.out.println("Min additions required for " + input3 + ": " + solution.minAddToMakeValid(input3));

        // Test case 4
        String input4 = "())(";
        System.out.println("Min additions required for " + input4 + ": " + solution.minAddToMakeValid(input4));
    }
}
