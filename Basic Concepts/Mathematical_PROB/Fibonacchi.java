import java.util.Scanner;
public class Fibonacchi{

    public static void main (String[] args) {
        
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any integer number : ");
        N = input.nextInt();

        int first = 0;
        int second = 1;

        System.out.print(first + " " + second + " ");

        for(int i = 3; i <= N; i++){


            int fibo = first+second;
            System.out.print(fibo + " ");
            first = second;
            second = fibo;
        }
        input.close();
        
    }
}