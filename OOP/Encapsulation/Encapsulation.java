class Student{
    private String name;
    private int id;

    private void GetData(String Name, int Id){
        name = Name;
        id = Id;

    }
    void Display(String Name, int Id){
        GetData(Name, Id);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.Display("Araf", 94);
    }
}
