import java.util.Scanner;
public class SumOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();

        System.out.println("Sum of digit of number is : "+ digitSum(a));
    }

    public static int digitSum(int number){

        int sum=0;
        while(number>0){
            int b = number%10;
            number /= 10;
            sum += b;
        }

        return sum;
    }
}
