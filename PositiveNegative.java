import java.sql.SQLOutput;
import java.util.Scanner;
public class PositiveNegative {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        float a = s.nextFloat();
        if(a<0){
            System.out.println("NEgative");

        }
        else if(a==0){
            System.out.println("ZEro");

        }
        else{
            System.out.println("POsitive");
        }


    }
}
