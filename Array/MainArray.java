public class MainArray {

    public static void main(String args[]){

        int[] array = new int[5];

        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;

        int arrSize = array.length;

        for(int i = 0; i < arrSize; i++){

            System.out.print(array[i]+" ");
        }
    }
}