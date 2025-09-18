import java.util.Scanner;
public class SwitchCase {
    public static void main(String args[]){

        String day;
        System.out.print("Enter the day name : ");
        Scanner input = new Scanner(System.in);
        day = input.next();

        String thatDay;

        switch (day) {
            case "Sutarday":
                thatDay = "Sutarday";
                break;
            case "Sunday":
                thatDay = "Sunday";
                break;
            case "Monday":
                thatDay = "Monday";
                break;
            case "Tuesday":
                thatDay = "Tuesday";
                break;
            case "Wednasday":
                thatDay = "Wednasday";
                break;
            case "Thursday":
                thatDay = "Thursday";
                break;
            case "Friday":
                thatDay = "Friday";
                break;
            default:
                thatDay = "Invalid";
        }
        System.out.println("Your day is : "+thatDay);
        input.close();
    }
}