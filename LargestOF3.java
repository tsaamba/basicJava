import java.util.Scanner;

public class LargestOF3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float a = s.nextFloat();
        float b = s.nextFloat();
        float c = s.nextFloat();

        if (a>=b && a>=c){
            System.out.println(a);
        }
        else if(b>=a && b>=c){
            System.out.println(b);

        }
        else{
            System.out.println(c);
        }
    }
}
