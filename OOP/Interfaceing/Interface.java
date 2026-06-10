interface Student{
    static final String name = "Araf";
    static final int id = 94;
    void Display();
}

class Result implements Student{
    public void Display(){
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
}

public class Interface {
    public static void main(String[] args) {
        Result result = new Result();
        result.Display();
    }
}
