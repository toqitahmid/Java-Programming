import java.util.Scanner;
public class SumOfArray {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int ASize;
        System.out.print("Enter array size : ");
        ASize = input.nextInt();
        int[] Array;
        Array = new int[ASize];
        
        System.out.println("Enter array elements : ");
        
        for(int i = 0; i < ASize; i++){
            Array[i] = input.nextInt();
        }

        
        int sum = 0;
        for(int i = 0; i < ASize; i++){
            sum += Array[i];
        }
        System.out.println("The sum of these array elements is : " + sum);
    }
}
