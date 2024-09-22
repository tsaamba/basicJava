import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("lcm is : " + lcm(a,b));
        System.out.println("gcd is : "+ gcd(a,b));

    }

    public static int lcm(int m, int n){
        int l = (m>n)? m : n;
        while(true){
            if(l%m==0 && l%n==0){
              //  System.out.println("LCM is : "+ l);
                break;
            }
            l++;
        }
        return l;
    }


    public static int gcd(int m, int n){

        while(m%n!=0){
            int rem = m%n;
            m = n;
            n = rem;

        }
        return n;

    }
}
