import java.util.Scanner;
public class ReverseNum {

    public static void main(String args[]){

        int num;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter any number : ");
        num = input.nextInt();

        int remainder, temp, reverse = 0;
        temp = num;

        while (temp > 0) {
            
            remainder = temp%10;
            reverse = (reverse*10) + remainder;
            temp = temp/10;
        }
        System.out.print("The reverse form of "+num+" is :"+reverse);
        input.close();
    }
}