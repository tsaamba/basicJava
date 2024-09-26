import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        long num = s.nextLong();
        double original = num;
        int digit = (int)Math.log10(num)+1;
        long sum =0;
        while (num>0){
            sum += Math.pow(num%10,digit);
            num /= 10;


        }
        //System.out.println(sum);
        if(original==sum){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not Armstrong number");
        }
    }

}
