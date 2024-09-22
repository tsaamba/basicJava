import java.util.Scanner;
public class primeOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println("the number is prime :"+ isPrime(a));



    }
    public static boolean isPrime(int n){
        int i =2;
        if(n==1){
            return false;
        }
        else {
            while(i<=n/2){
                if(n%i==0){
                    return false;
                }
                else{
                    i++;
                }
            }
            return true;

        }
    }
}
