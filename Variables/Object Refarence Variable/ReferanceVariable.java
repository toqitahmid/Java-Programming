class Referance {
    int number;
    Referance(int num){
        number = num;
    }
    public void display (){ 
        System.out.println("Number:"+ number);
    }
}

public class ReferanceVariable{
    public static void main(String[] args) {
        Referance num1 = new Referance(1);
        Referance num2 = num1;

        num1.display();
        num2.display();
    }
}