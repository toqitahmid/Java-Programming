import java.util.Scanner;
public class TringleArea {

    public static void main(String args[]){

        int a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a : ");
        a = input.nextInt();
        System.out.print("Enter b : ");
        b = input.nextInt();
        System.out.print("Enter c : ");
        c = input.nextInt();

        if((a+b > c) && (b+c > a) && (c+a > b)){

            double s = (a+b+c)/2.0;

            double area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
            System.out.println("The area of the tringle is : " + area);
        }else{

            System.out.println("Trangle is not possible to created!");
        }

        input.close();
    }
}