import java.util.Scanner;
public class InsertElements {
    
    public static void  main(String[] args){

        Scanner input = new Scanner(System.in);
        int Asize;
        System.out.print("Enter array size : ");
        Asize = input.nextInt();
        
        int[] A;
        A = new int[Asize + 1];
        System.out.println("Enter array elements : ");
        for(int i = 0; i < Asize; i++)
        A[i] = input.nextInt();
        
        int pos, item;
        System.out.print("Enter the position where the item to be inserted : ");
        pos = input.nextInt();
        System.out.print("Enter the item which be inserted : ");
        item = input.nextInt();

        if(pos < 0 || pos >= Asize){
            System.out.println("Position Invalid!");
        }
        else{
            for(int i = Asize; i>pos; i--){

                A[i] = A[i-1];
            }
            A[pos] = item;
            Asize++;

        }
        System.out.println("After inserting the item : ");
        for(int i = 0; i < Asize; i++){
            System.out.println(A[i]);
        }

    }
}
