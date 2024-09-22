import java.util.Scanner;
public class FactorialFxn {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(factorial(a));
        System.out.println(factorial(7));

    }

    public static int factorial(int n){

      if(n<2){
          return 1;
      }
      else {
          int i = 1;
          int fact = 1;
          while (i <= n) {
              fact *= i;
              i++;
          }

          return fact;
      }
    }
}
