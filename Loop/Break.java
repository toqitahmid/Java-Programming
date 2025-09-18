public class Break {

    public static void main(String args[]){

        int sum = 0;

        for(int i = 1; i <= 10; i++){

            sum +=i;
            if(i == 5)
                break;
        }

        System.out.println("Sum is : "+sum);
    }
}