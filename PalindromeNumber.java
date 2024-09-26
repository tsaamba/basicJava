import java.util.Scanner;
public class PalindromeNumber {
    public static void main(String [] args ){

        Scanner s = new Scanner(System.in);
        long a = s.nextLong();
        //System.out.println(reverseD(a));

        long reverse = reverseD(a);
        if(reverse==a) System.out.println("palindrome");
        else System.out.println("not palindrome");
    }
    public static long reverseD(long n){

        int digit = (int)Math.log10(n)+1;
        long revD = 0;
        while (n>0){
            revD += (n%10)*Math.pow(10,digit-1);
            n /= 10;
            digit--;
        }
        return revD;

    }
}
