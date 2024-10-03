public class validPalindrom {
    public static boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();

        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                str.append(Character.toLowerCase(c));
            }
        }
        StringBuilder revstr = new StringBuilder(str).reverse();
        return str.toString().equals (revstr.toString());

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("a man with car"));
    }
}
