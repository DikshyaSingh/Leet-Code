import java.util.Scanner;

public class excelSheetColumnTitle {
    public static String convertToTitle(int columnNumber){
        StringBuilder title = new StringBuilder();

        while(columnNumber > 0){
            columnNumber --;
            int remainder = columnNumber % 26;
            title.insert(0,(char) (remainder + 'A'));
            columnNumber /= 26;

        }
        return title.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        System.out.println(convertToTitle(num));
    }
}
