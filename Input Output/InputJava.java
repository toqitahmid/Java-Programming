import java.util.Scanner;
public class InputJava {
    public static void main(String args[]){

        String name;
        int age;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name : ");
        name = input.nextLine();

        System.out.print("Enter you age : ");
        age = input.nextInt();

        System.out.println("Hello " + name);
        System.out.println("Or you age is " + age);

        input.close();
    }
}