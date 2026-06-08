import java.util.Scanner;
public class InputArray {

    public static void main(String args[]){

        int arrSize;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the array size : ");
        arrSize = input.nextInt();

        int[] array;
        array = new int[arrSize];

        for(int i = 0; i < arrSize; i++){

            array[i] = input.nextInt();
        }

        for(int i = 0; i < arrSize; i++){

            System.out.print(array[i] + " ");
        }

        input.close();
    }
}