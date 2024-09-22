import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the table number");
        int a = s.nextInt();

        for(int i =1; i<11;i++){
            System.out.println(a+ "*" + i +" = " + a*i);

        }

    }
}
