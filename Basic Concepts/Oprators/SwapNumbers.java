import java.util.Scanner;
public class SwapNumbers {

    public static void main(String args[]){

        int a,b,temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a : ");
        a = input.nextInt();
        System.out.print("Enter b : ");
        b = input.nextInt();

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swaping a : " + a + " and ");

        System.out.print("After sawping b : " + b);

        input.close();
    }
}