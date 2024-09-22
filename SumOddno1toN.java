import java.util.Scanner;
public class SumOddno1toN {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        System.out.println("Enter the last value n: ");
;       int n = s.nextInt();

        int i =1;
        int sum =0;
        while (i<n){
            sum +=i;
          i+=2;

        }
        System.out.println(sum);
    }
}
