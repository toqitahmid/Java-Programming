import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter a : ");
        a = input.nextInt();
        System.out.print("Enter b : ");
        b = input.nextInt();
        System.out.print("Enter c : ");
        c = input.nextInt();

        int d = ((b*b)-(4*a*c));

        if(d > 0){
            double root1 = ((-b+Math.sqrt(d))/(2*a));
            double root2 = ((-b-Math.sqrt(d))/(2*a));

            System.out.println("The root1 and root2 are : " + root1 + " " + root2);
        }
        else if(d == 0){
            double root = ((-b)/(2*a));
            System.out.println("The root is : " + root);
        }
        else{
            System.out.println("Roots are not real!");
        }
    }
}
