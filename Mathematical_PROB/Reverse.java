import java.util.Scanner;
public class Reverse {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int num, temp, reminder, newNum = 0;
        System.out.print("Enter any number : ");
        num = input.nextInt();
        temp = num;

        while(num > 0){

            reminder = num % 10;
            newNum = (newNum*10) + reminder;
            num = num/10;
        }
        System.out.println("After reversing : " + newNum);
    }
}
