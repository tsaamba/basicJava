import java.util.Scanner;
public class SwapTwoNo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter first number: ");
        int a = s.nextInt();
        System.out.print("enter second number: ");
        int b = s.nextInt();


        int temp = 0;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped two number are : "+ a +" "+ b);

    }

}
