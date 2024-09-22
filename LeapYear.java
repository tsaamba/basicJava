import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int a = s.nextInt();
        if(a%100==0){
            if(a%400==0){
                System.out.println("LY");
            }
            else{
                System.out.println("nly");
            }
        }
        else if(a%4==0){
            System.out.println("LY");
        }
        else{
            System.out.println("nly");
        }
    }
}
