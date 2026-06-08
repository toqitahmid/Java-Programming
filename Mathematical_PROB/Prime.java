import java.util.Scanner;

public class Prime{

    static boolean isPrime(int N){

        for(int i = 2; i <=(N/2); i++){

            if(N%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        
        int N;
        System.out.print("Enter any positive number : ");
        Scanner input = new Scanner(System.in);
        N = input.nextInt();

        boolean checkPrime = isPrime(N);

        if(checkPrime == true)
            System.out.print(N+" is a prime number");
        else
            System.out.print(N+" is not a prime number");

        input.close();
    }
}