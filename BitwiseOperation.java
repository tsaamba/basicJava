import java.sql.SQLOutput;
import java.util.Scanner;
public class BitwiseOperation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first operand: ");
        int a = s.nextInt();

        System.out.print("Enter the second operand: ");
        int b = s.nextInt();

        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println(a<<b);
        System.out.println(a>>b);
        System.out.println(~a);
    }
}
