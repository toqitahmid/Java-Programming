import java.util.Scanner;
public class TowDimentionalArray {
    
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int row,col;
        System.out.print("Enter row number : ");
        row = input.nextInt();
        System.out.print("Enter column number : ");
        col = input.nextInt();
        
        int[][] A;
        A = new int[row][col];
        
        System.out.println("Enter elements : ");
        
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                
                System.out.print("A["+i+"]"+"["+j+"] : ");
                A[i][j] = input.nextInt();
            }
        }
        
        System.out.println("Now the tow dimentional array is : ");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){

                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
