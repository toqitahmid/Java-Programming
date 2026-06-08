public class Continue {

    public static void main(String args[]){

        int sum = 0; 

        for(int i = 1; i <= 10; i++){

            if(i == 5)
                continue;
            
            sum = sum+i;
        }
        System.out.println("The sum is : " + sum);
    }
}