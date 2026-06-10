class Student{
    public String name;
    public int id;

    void GetData(){
        name = "Araf";
        id = 94;
    }

    void Display(){
        System.out.println("Inside Student class: ");
        System.out.println("Name: " + name);
        System.out.println("Id: " + id);
    }
    
}

class Exam extends Student {
    public int mark;
    
    @Override
    void GetData(){
        // call prarent class display method to intialize name and id
        super.GetData();
        mark = 80;
    }
    
    @Override
    void Display(){
        // call prarent class display method to show name and id
        super.Display();
        System.out.println("Mark: " + mark);
    }
}

class Result extends Exam{
    @Override
    void Display(){
        // call prarent class display method to show name, id and mark
        super.Display();
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Result reslt = new Result();
        reslt.GetData();
        reslt.Display();
    }
    
}
