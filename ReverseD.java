import java.util.Scanner;

public class ReverseD {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int  a = s.nextInt();
        int c = countD(a);
        System.out.println((int)reverseD(a,c));


    }

    public static int countD(int m ){

        int i =0;
        while(m>0){
            m /=10;
            i++;
        }
        return i;
    }

    public static double reverseD(int p, int q){

        double rev = 0;
        while(p>0){
            int rem = p%10;
            rev += rem * (Math.pow(10,q-1));
            p /=10;
            q--;

        }
        return rev;
    }
}
