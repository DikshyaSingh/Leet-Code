import java.util.Scanner;

public class validParentheses {
    public static boolean isValid(String s) {
        int length;
        do{
            length= s.length();
            s=s.replace("()","").replace("[]","").replace("{}","");
        }while(length != s.length());
        return s.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }
}
