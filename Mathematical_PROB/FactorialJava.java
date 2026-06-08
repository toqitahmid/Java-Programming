import  java.util.Scanner;
public class FactorialJava{
    public static void main(String[] args){

        int N;
        System.out.print("Enter any integer number : ");
        Scanner input = new Scanner(System.in);
        N = input.nextInt();
        
        int fact = 1;
        for(int i = 1; i <= N; i++)
            fact *= i;
        
        System.out.print("The factorial of "+N+" is : " + fact);
        System.out.println();
        input.close();
    }
}