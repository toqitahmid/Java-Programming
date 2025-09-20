class Student{

    // Instance Variable
    String name;
    int cls;
    int id;

    // Static Variable Or Class Varible
    static String collegeName = "SSR Institute Of Technology And Management";

    Student(String name, int cls, int id){

        this.name = name;
        this.cls = cls;
        this.id = id;
    }

    void printInfo(){

        System.out.println("Student Name:"+this.name);
        System.out.println("Class:"+this.cls);
        System.out.println("Student id:"+this.id);
        System.out.println("College:"+collegeName);
    }
}

public class StaticVariable {

    public static void main(String args[]){

        Student student1;
        student1 = new Student("Araf", 12, 856294);
        student1.printInfo();

        System.out.println();

        Student student2;
        student2 = new Student("Jannat", 12, 856290);
        student2.printInfo();
    }
}