import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();

        System.out.println(2*a+2*b);
    }
}
