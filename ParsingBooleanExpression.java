import java.util.Stack;

public class ParsingBooleanExpression {
    public boolean parseBoolExpr(String expression) {
        Stack<Character> st = new Stack<>();

        for (char currChar : expression.toCharArray()) {
            if (currChar == ',' || currChar == '(') continue;
            if (
                    currChar == 't' ||
                            currChar == 'f' ||
                            currChar == '!' ||
                            currChar == '&' ||
                            currChar == '|'
            ) {
                st.push(currChar);
            }
            else if (currChar == ')') {
                boolean hasTrue = false, hasFalse = false;

                while (
                        st.peek() != '!' && st.peek() != '&' && st.peek() != '|'
                ) {
                    char topValue = st.pop();
                    if (topValue == 't') hasTrue = true;
                    if (topValue == 'f') hasFalse = true;
                }

                char op = st.pop();
                if (op == '!') {
                    st.push(hasTrue ? 'f' : 't');
                } else if (op == '&') {
                    st.push(hasFalse ? 'f' : 't');
                } else {
                    st.push(hasTrue ? 't' : 'f');
                }
            }
        }
        return st.peek() == 't';
    }
    public static void main(String[] args) {
        ParsingBooleanExpression parser = new ParsingBooleanExpression();

        // Test cases
        String expression1 = "!(&(t,f,t))";
        String expression2 = "|(f,t)";
        String expression3 = "&(t,t,f)";
        String expression4 = "!(f)";

        System.out.println("Result for expression1: " + parser.parseBoolExpr(expression1)); // Expected: true
        System.out.println("Result for expression2: " + parser.parseBoolExpr(expression2)); // Expected: true
        System.out.println("Result for expression3: " + parser.parseBoolExpr(expression3)); // Expected: false
        System.out.println("Result for expression4: " + parser.parseBoolExpr(expression4)); // Expected: true
    }
}
