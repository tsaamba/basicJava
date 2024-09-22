import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args){
        System.out.print("Principal : ");
        Scanner s = new Scanner(System.in);
        double principal = s.nextDouble();
        System.out.print("Time in years : ");
        float time = s.nextFloat();
        System.out.print("rate of interest: ");
        float rate = s.nextFloat();

        double amount = principal*Math.pow((1+rate/100),time);
        System.out.println("compound interest is : " + (amount- principal));


    }
}
