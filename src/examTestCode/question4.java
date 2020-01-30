package examTestCode;
import java.util.Scanner;

public class question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please type in two words");
        String string1=scanner.next();
        String string2=scanner.next();
        int length1=string1.length();
        int length2=string2.length();
        if (length1>length2) {
            System.out.println(string2);
            System.out.println(string1);
        } else if (length1<length2) {
            System.out.println(string1);
            System.out.println(string2);
        } else if (length1==length2) {
            System.out.println(string1);
            System.out.println(string2);

        }
    }
}
