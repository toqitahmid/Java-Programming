public class StaticVariable{
    
    int num;
    static int count;

    StaticVariable(int n){
        num = n;
        count++;
    }

    public void Show(){
        System.out.println("The " + count + " object value is : " + num);
    }

    public static void main(String[] args) {
        StaticVariable first_obj = new StaticVariable(75);
        first_obj.Show();
        StaticVariable scd_obj = new StaticVariable(7);
        scd_obj.Show();
    }
    
}
