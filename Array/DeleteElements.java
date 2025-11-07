import java.util.Scanner;
public class DeleteElements{

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int Asize;
        System.out.print("Enter array size : ");
        Asize = input.nextInt();
        
        int[] A;
        A = new int[Asize+1];
        
        System.out.println("Enter array elements : ");
        for(int i = 0; i < Asize; i++){
            A[i] = input.nextInt();
        }
        
        int pos;
        System.out.print("Enter position where the specific item to be deleted : ");
        pos = input.nextInt();
        
        if(pos < 0 || pos >= Asize){
            
            System.out.println("Position Invalid!");
        }
        else{
            for(int i = pos; i < Asize; i++){
                A[i] = A[i+1];
            }
            Asize--;
        }
        System.out.println("After deleting : ");
        for(int i = 0; i < Asize; i++){
            System.out.println(A[i]);
        }

    }
}